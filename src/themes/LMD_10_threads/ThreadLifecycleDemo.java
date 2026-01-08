package themes.LMD_10_threads;

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread notStarted = new Thread(() -> {}, "notStarted");
        System.out.println("notStarted state: " + notStarted.getState()); // NEW

        Thread worker = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Worker: acquired lock");
                try {
                    lock.wait(); // WAITING until notified
                    System.out.println("Worker: resumed after wait");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                Thread.sleep(200); // TIMED_WAITING
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Worker: finishing");
        }, "worker");

        synchronized (lock) {
            worker.start();
            // while main holds the lock, worker will try to enter synchronized(lock) -> BLOCKED
            System.out.println("After start (main holds lock) worker state: " + worker.getState());
            Thread.sleep(50);
        } // releasing lock lets worker acquire it and call wait() -> WAITING

        Thread.sleep(50);
        System.out.println("After release worker state (should be WAITING): " + worker.getState());

        synchronized (lock) {
            lock.notify(); // notify worker to wake (it will try to re-acquire the lock)
            System.out.println("Notified worker, state now: " + worker.getState());
        }

        Thread.sleep(20);
        System.out.println("State shortly after notify (likely TIMED_WAITING or RUNNABLE): " + worker.getState());

        worker.join();
        System.out.println("Final worker state: " + worker.getState()); // TERMINATED
    }
}