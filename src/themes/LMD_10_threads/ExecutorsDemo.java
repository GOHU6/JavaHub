package themes.LMD_10_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-threads.htm#threads
 * Section: 37
 */

public class ExecutorsDemo extends Thread {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running in " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed in " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
        
        System.out.println("\n Executors demo complete\n\n");


    }
}