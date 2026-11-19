public class EvenOddThreadsDemo {
    static class EvenThread extends Thread {
        @Override
        public void run() {
            System.out.println("EvenThread started [Thread: " + Thread.currentThread().getName() + "]:");
            for (int i = 2; i <= 20; i += 2) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("\nEvenThread execution complete.\n");
        }
    }

    static class OddThread extends Thread {
        @Override
        public void run() {
            System.out.println("OddThread started [Thread: " + Thread.currentThread().getName() + "]:");
            for (int i = 1; i <= 20; i += 2) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("\nOddThread execution complete.\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Number Printing Using Threads ================");
        
        System.out.println("========= 1. Demonstration of start() Method (Concurrent Multithreading) =========");
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.setName("Even-Thread");
        t2.setName("Odd-Thread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("========= 2. Demonstration of run() Method (Direct Synchronous Execution) =========");
        System.out.println("Calling run() directly runs sequentially on thread: " + Thread.currentThread().getName());
        EvenThread t3 = new EvenThread();
        t3.run();
        System.out.println("==================================================================================");
    }
}
