package themes.LMD_10_threads;

public class SynchronizationDemo {
    private static class Counter {
        private int value = 0;

        public synchronized void increment() { 
            value++; 
        }

        public int get() { 
            return value; 
        }
    }

    public void runTest() throws Exception {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter.get());
    }


    public static void main(String[] args) throws Exception {
        new SynchronizationDemo().runTest();

        System.out.println("\n Synchronization demo complete\n\n");
    }
}