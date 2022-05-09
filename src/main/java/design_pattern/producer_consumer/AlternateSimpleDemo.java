package design_pattern.producer_consumer;

public class AlternateSimpleDemo {
    public static void main(String[] args) {
        ResourceSimple resource = new ResourceSimple();

        new Thread(() -> {
            while (true) {
                try {
                    resource.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            while (true) {
                try {
                    resource.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
    }
}

class ResourceSimple {
    private volatile int num = 0;

    public synchronized void produce() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName());
        num++;
        this.notifyAll();
        Thread.sleep(1000);
    }

    public synchronized void consume() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName());
        num--;
        this.notifyAll();
        Thread.sleep(1000);
    }
}

