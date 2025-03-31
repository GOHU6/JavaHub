package main;

import JMD_L1_Variables.ConversionTypes;
import JMD_L1_Variables.PorteeVariables;
import JMD_L1_Variables.VariablesPrimitives;
import JMD_L1_Variables.VariablesReference;
import JMD_L2_Operations.OperationsArithmetiques;
import JMD_L2_Operations.OperationsBitwise;
import JMD_L2_Operations.OperationsLogiques;
import JMD_L2_Operations.OperationsRelationnelles;
import JMD_L3_Structures_Controles.Boucles;
import JMD_L3_Structures_Controles.InstructionsConditionnelles;

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
        
        System.out.println("\n--- Opérations Arithmétiques ---");
        OperationsArithmetiques.main(args);

        System.out.println("\n--- Opérations Relationnelles ---");
        OperationsRelationnelles.main(args);
        
        System.out.println("\n--- Opérations Logiques ---");
        OperationsLogiques.main(args);

        System.out.println("\n--- Opérations Bitwise ---");
        OperationsBitwise.main(args);
        
        System.out.println("\n--- Instructions Conditionnelles ---");
        InstructionsConditionnelles.main(args);

        System.out.println("\n--- Boucles ---");
        Boucles.main(args);
	}
	
	
}
