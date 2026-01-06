package themes.LMD_08_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    protected String nomFichier;
    protected File fichier;
    
    public FileDemo(String nomFichier) {
        this.nomFichier = nomFichier;
        fichier = new File(nomFichier);
        traitement();
    }

    public static void main(String args[]) {
        new FileDemo("src/themes/LMD_08_io/source.txt");
    }

    private void traitement() {

        if (!fichier.exists()) { 
            System.out.println("le fichier "+nomFichier+" n'existe pas");
            System.exit(1);
        }      
        
        System.out.println(" Nom du fichier    : " + fichier.getName());
        System.out.println(" Parent du fichier : " + fichier.getParent());
        System.out.println(" Chemin du fichier : " + fichier.getPath());
        System.out.println(" Chemin absolu     : " + fichier.getAbsolutePath());
        System.out.println(" Taille (octets)   : " + fichier.length());
        System.out.println(" Droit de lecture  : " + fichier.canRead()); //fichier.setReadable(true, false);
        System.out.println(" Droit d'ecriture  : " + fichier.canWrite()); //fichier.setWritable(true, true);
        System.out.println(" Droit d'execution : " + fichier.canExecute()); //fichier.setExecutable(true, true);
        System.out.println(" Est caché         : "+ fichier.isHidden());

        System.out.println(" Est un répertoire : "+ fichier.isDirectory());
        System.out.println(" Est un fichier    : "+ fichier.isFile());

        System.out.println(" Dernière modif    : " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(fichier.lastModified())));
    
        if (fichier.isDirectory() ) {
            System.out.println(" Contenu du repertoire ");
            String fichiers[] = fichier.list();
            if (fichiers != null) {
               for (String string : fichiers) {
                System.out.println(" -" +string);
               } 
            }
                
        }     
  }			
}
