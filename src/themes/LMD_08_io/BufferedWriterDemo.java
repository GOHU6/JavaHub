package themes.LMD_08_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-flux.htm
 * Section: 15
 */

public class BufferedWriterDemo {
	protected String destination;
  
    public BufferedWriterDemo(String destination) {
        this.destination = destination;
        traitement();
    }
    
	public static void main(String[] args) {
	    new BufferedWriterDemo("src/themes/LMD_08_io/destination.txt");

        System.out.println("\n Buffered Writer demo complete\n\n");
	}

    private void traitement() { 
        try {
            int nombre = 123;
            BufferedWriter fichier = new BufferedWriter(new FileWriter(destination));

            fichier.write("Bonjour tout le monde");
            fichier.newLine();
            fichier.write("Nous sommes le "+ new Date());      
            fichier.write(", le nombre magique est " + nombre);

            fichier.close();
            System.out.println("\n Buffered Writer demo complete\n\n");

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }    
}
