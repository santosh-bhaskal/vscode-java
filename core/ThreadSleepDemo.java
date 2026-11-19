public class ThreadSleepDemo {
    static class DelayedThread extends Thread {
        DelayedThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " started (printing with 1-second sleep delay):");
            for (int i = 1; i <= 5; i++) {
                System.out.println("[" + getName() + "] Count : " + i);
                try {
                    Thread.sleep(1000); // 1-second delay
                } catch (InterruptedException e) {
                    System.out.println(getName() + " interrupted: " + e.getMessage());
                }
            }
            System.out.println(getName() + " finished.\n");
        }
    }

    static class NormalThread extends Thread {
        NormalThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " started (normal fast execution):");
            for (int i = 1; i <= 5; i++) {
                System.out.println("[" + getName() + "] Count : " + i);
            }
            System.out.println(getName() + " finished.\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Demonstration of Thread.sleep() Method ================");

        DelayedThread t1 = new DelayedThread("Delayed-Thread");
        NormalThread t2 = new NormalThread("Normal-Thread");

        System.out.println("Starting both threads simultaneously...\n");
        t1.start();
        t2.start();
    }
}
