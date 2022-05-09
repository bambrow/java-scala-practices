package design_pattern.producer_consumer;

public class AlternateDemo {

    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(new Producer(resource, "A")).start();
        new Thread(new Consumer(resource, "B")).start();
    }
}

class Resource {
    private Boolean isSet = false;
    private final Object LOCK = new Object();

    public Resource() {}

    public void set() {
        synchronized (LOCK) {
            this.isSet = true;
        }
    }

    public void unset() {
        synchronized (LOCK) {
            this.isSet = false;
        }
    }

    public boolean isSet() {
        return this.isSet;
    }

    public void lockWait() throws InterruptedException {
        synchronized (LOCK) {
            LOCK.wait();
        }
    }

    public void lockNotifyAll() {
        synchronized (LOCK) {
            LOCK.notifyAll();
        }
    }
}

class Producer implements Runnable {
    private final Resource resource;

    public Producer(Resource resource, String name){
        this.resource = resource;
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        try {
            produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void produce() throws InterruptedException {
        while (true) {
            while (resource.isSet()) {
                try {
                    resource.lockWait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            resource.set();
            resource.lockNotifyAll();
        }
    }
}

class Consumer implements Runnable {
    private final Resource resource;

    public Consumer(Resource resource, String name){
        this.resource = resource;
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            while (!resource.isSet()) {
                try {
                    resource.lockWait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            resource.unset();
            resource.lockNotifyAll();
        }
    }
}
