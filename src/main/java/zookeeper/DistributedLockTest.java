package zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.*;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.TestingServer;
import org.apache.curator.utils.CloseableUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DistributedLockTest {
    private final String lockPath = "/distributed";
    private CuratorFramework client1;
    private CuratorFramework client2;
    private TestingServer server;

    @Before
    public void init() throws Exception {
        server = new TestingServer();
        System.out.println("Creating server: " + server.getConnectString() + ", " + server.getTempDirectory());
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        client1 = CuratorFrameworkFactory.newClient(server.getConnectString(), retryPolicy);
        client2 = CuratorFrameworkFactory.newClient(server.getConnectString(), retryPolicy);
        client1.start();
        client2.start();
    }

    @After
    public void close() {
        CloseableUtils.closeQuietly(client1);
        CloseableUtils.closeQuietly(client2);
        CloseableUtils.closeQuietly(server);
    }

    @Test
    public void sharedLock() throws Exception {
        InterProcessLock lock1 = new InterProcessSemaphoreMutex(client1, lockPath);
        InterProcessLock lock2 = new InterProcessSemaphoreMutex(client2, lockPath);
        lock1.acquire();
        // not reentrant
        Assert.assertFalse(lock1.acquire(1, TimeUnit.SECONDS));
        Assert.assertFalse(lock2.acquire(1, TimeUnit.SECONDS));
        lock1.release();
        Assert.assertTrue(lock2.acquire(1, TimeUnit.SECONDS));
        lock2.release();
    }

    @Test
    public void sharedReentrantLock() throws Exception {
        InterProcessLock lock1 = new InterProcessMutex(client1, lockPath);
        InterProcessLock lock2 = new InterProcessMutex(client2, lockPath);
        lock1.acquire();
        try {
            lock1.acquire();
            try {
                Assert.assertFalse(lock2.acquire(1, TimeUnit.SECONDS));
            } finally {
                lock1.release();
            }
        } finally {
            lock1.release();
        }
        Assert.assertTrue(lock2.acquire(1, TimeUnit.SECONDS));
        // reentrant
        Assert.assertTrue(lock2.acquire(1, TimeUnit.SECONDS));
        lock2.release();
    }

    @Test
    public void sharedReentrantReadWriteLock() throws Exception {
        InterProcessReadWriteLock lock1 = new InterProcessReadWriteLock(client1, lockPath);
        InterProcessReadWriteLock lock2 = new InterProcessReadWriteLock(client2, lockPath);
        // locks are reentrant
        InterProcessLock readLock = lock1.readLock();
        InterProcessLock writeLock = lock2.writeLock();

        class ReadWriteLockTest {
            private int testData = 0;
            private final Set<Thread> threadSet = new HashSet<>();

            private void write() throws Exception {
                writeLock.acquire();
                try {
                    Thread.sleep(10);
                    testData++;
                    System.out.println("Writing data: " + testData);
                } finally {
                    writeLock.release();
                }
            }

            private void read() throws Exception {
                readLock.acquire();
                try {
                    Thread.sleep(10);
                    System.out.println("Reading data: " + testData);
                } finally {
                    readLock.release();
                }
            }

            public void waitThread() throws InterruptedException {
                for (Thread thread : threadSet) {
                    thread.join();
                }
            }

            private void createThread(int type) {
                Thread thread = new Thread(() -> {
                    try {
                        if (type == 1) {
                            write();
                        } else {
                            read();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                threadSet.add(thread);
                thread.start();
            }

            public void test() {
                for (int i = 0; i < 5; i++) {
                    createThread(1);
                }
                for (int i = 0; i < 5; i++) {
                    createThread(2);
                }
            }
        }

        System.out.println("DistributedLockDemo: sharedReentrantReadWriteLock");
        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
        readWriteLockTest.test();
        readWriteLockTest.waitThread();
    }

    @Test
    public void semaphore() throws Exception {
        // maxLeases = 6
        InterProcessSemaphoreV2 semaphore1 = new InterProcessSemaphoreV2(client1, lockPath, 6);
        InterProcessSemaphoreV2 semaphore2 = new InterProcessSemaphoreV2(client2, lockPath, 6);
        // 1/6
        Lease lease1 = semaphore1.acquire();
        Assert.assertNotNull(lease1);
        Assert.assertEquals(semaphore1.getParticipantNodes(), semaphore2.getParticipantNodes());
        // 2/6
        Lease lease2 = semaphore2.acquire(1, TimeUnit.SECONDS);
        Assert.assertNotNull(lease2);
        Assert.assertEquals(semaphore1.getParticipantNodes(), semaphore2.getParticipantNodes());
        // 4/6
        Collection<Lease> leases1 = semaphore1.acquire(2);
        Assert.assertEquals(2, leases1.size());
        Assert.assertEquals(semaphore1.getParticipantNodes(), semaphore2.getParticipantNodes());
        // 6/6
        Collection<Lease> leases2 = semaphore2.acquire(2, 1, TimeUnit.SECONDS);
        Assert.assertEquals(2, leases2.size());
        Assert.assertEquals(semaphore1.getParticipantNodes(), semaphore2.getParticipantNodes());
        // cannot acquire more
        Assert.assertNull(semaphore1.acquire(1, TimeUnit.SECONDS));
        Assert.assertNull(semaphore2.acquire(1, TimeUnit.SECONDS));
        // release
        semaphore1.returnLease(lease1);
        semaphore2.returnLease(lease2);
        semaphore1.returnAll(leases1);
        semaphore2.returnAll(leases2);
    }

    @Test
    public void multiLock() throws Exception {
        // reentrant
        InterProcessLock interProcessLock1 = new InterProcessMutex(client1, lockPath);
        // not reentrant
        InterProcessLock interProcessLock2 = new InterProcessSemaphoreMutex(client2, lockPath);
        // multi lock
        InterProcessLock lock = new InterProcessMultiLock(Arrays.asList(interProcessLock1, interProcessLock2));
        lock.acquire();
        Assert.assertFalse(lock.acquire(1, TimeUnit.SECONDS));
        Assert.assertTrue(interProcessLock1.acquire(1, TimeUnit.SECONDS));
        Assert.assertFalse(interProcessLock2.acquire(1, TimeUnit.SECONDS));
        lock.release();
        Assert.assertTrue(interProcessLock2.acquire(1, TimeUnit.SECONDS));
    }
}
