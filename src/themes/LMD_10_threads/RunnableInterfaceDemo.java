package themes.LMD_10_threads;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-threads.htm#threads
 * Section: 37
 * 
 * permet l’héritage multiple
 */

public class RunnableInterfaceDemo implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        RunnableInterfaceDemo task = new RunnableInterfaceDemo();

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All workers finished.");
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" -> "+i);
            try { 
                Thread.sleep(400); 

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}