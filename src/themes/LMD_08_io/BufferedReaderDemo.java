package themes.LMD_08_io;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-flux.htm
 * Section: 15
 */

public class BufferedReaderDemo {
	protected String source;
  
    public BufferedReaderDemo(String source) {
        this.source = source;
        lecture();
    }
    
	public static void main(String[] args) {
	    new BufferedReaderDemo("src/themes/LMD_08_io/source.txt");

        System.out.println("\n Buffered Reader demo complete\n\n");
	}

    private void lecture() { 
        try {
            String ligne ;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
      
            while ((ligne = fichier.readLine()) != null) {
                System.out.println(ligne);
            }

            fichier.close();
            System.out.println("\n Buffered Reader demo complete\n\n");

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }    
}
