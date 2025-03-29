package introductionjava;

import variables.ConversionTypes;
import variables.PorteeVariables;
import variables.VariablesPrimitives;
import variables.VariablesReference;

public class MainApplication {
	/* 
	 * Pour exécuter la class MainApplication :
	 *  - Eclipse : Clic droit sur MainApplication.java -> Run As -> Java Application
	 *  - CMD     : cd introductionjava\src -> java introductionjava.MainApplication
	 */

	/* 
	 * Pour déployer le projet sous forme d'un fichier .jar :
	 *  1. Compiler le code :
	 *     CMD : cd introductionjava\src -> javac -d ../jar introductionjava/MainApplication.java
	 *  
	 *  2. Créer un fichier MANIFEST.MF dans le dossier /jar (laisser une ligne vide à la fin du fichier)
	 *  
	 *  3. Générer le fichier JAR :
	 *     CMD : cd introductionjava\jar -> jar cvfm application.jar MANIFEST.MF introductionjava/*.class
	 */
	
	public static void main(String[] args) {
		System.out.println("Bonjour");
		
        System.out.println("\n--- Variables Primitives ---");
        VariablesPrimitives.main(args); // Si on a une methode public static void main(String[] args) {}

        System.out.println("\n--- Variables de Référence ---");
        VariablesReference variablesref = new VariablesReference();
        variablesref.declaration_objets_reference(); // Si on a une methode public void xxx() {}

        System.out.println("\n--- Conversion de Types ---");
        ConversionTypes.main(args);

        System.out.println("\n--- Portée des Variables ---");
        PorteeVariables.main(args);
	}
	
	
}
