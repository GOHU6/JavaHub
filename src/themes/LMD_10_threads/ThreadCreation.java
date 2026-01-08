package themes.LMD_10_threads;
/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-threads.htm#threads
 * Section: 37
 */
public class ThreadCreation extends Thread {

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(getName()+" -> "+i);
            try {
                // Met le thread en pause pendant 500 ms TIMED_WAITING
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        
        ThreadCreation t1 = new ThreadCreation();
        ThreadCreation t2 = new ThreadCreation();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        // Démarre les threads (appel de la méthode run())
        t1.start();
        t2.start();
        
        System.out.println("\n Thread creation demo complete\n\n");


    }
}