public class ThreadPriorityDemo {
    static class PriorityWorker extends Thread {
        PriorityWorker(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Executing -> Thread Name: " + getName() + " | Priority: " + getPriority());
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Demonstration of Thread Priorities ================");

        PriorityWorker high = new PriorityWorker("HighPriority");
        PriorityWorker med = new PriorityWorker("MediumPriority");
        PriorityWorker low = new PriorityWorker("LowPriority");

        high.setPriority(Thread.MAX_PRIORITY);  // 10
        med.setPriority(Thread.NORM_PRIORITY);  // 5
        low.setPriority(Thread.MIN_PRIORITY);   // 1

        System.out.println("=============== Assigned Thread Priorities ===============");
        System.out.println("Thread 1 Name : " + high.getName() + " | Priority : " + high.getPriority());
        System.out.println("Thread 2 Name : " + med.getName() + " | Priority : " + med.getPriority());
        System.out.println("Thread 3 Name : " + low.getName() + " | Priority : " + low.getPriority());

        System.out.println("\n=============== Starting Threads ===============");
        low.start();
        med.start();
        high.start();

        try {
            low.join();
            med.join();
            high.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("====================================================================");
    }
}
