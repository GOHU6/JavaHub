package main;

import JMD_L1_Variables_Types.TypeCasting;
import JMD_L1_Variables_Types.VariableScope;
import JMD_L2_Operators.ArithmeticOperators;
import JMD_L2_Operators.BitwiseOperators;
import JMD_L2_Operators.LogicalOperators;
import JMD_L3_Control_Flow.Loops;
import JMD_L3_Control_Flow.ConditionalInstructions;
import JMD_L2_Operators.ComparisonOperators;
import JMD_L1_Variables_Types.Constants;
import JMD_L1_Variables_Types.PrimitiveDataTypes;
import JMD_L1_Variables_Types.ReferenceDataTypes;

public class MainApplication {
	/* 
	 * Pour exécuter la class MainApplication :
	 *  - Eclipse : Clic droit sur MainApplication.java -> Run As -> Java Application
	 *  - CMD     : cd JavaHub\src -> java main.MainApplication
	 */

	/* 
	 * Pour déployer le projet sous forme d'un fichier .jar :
	 *  1. Compiler le code :
	 *     CMD : cd JavaHub\src -> javac -d ../jar main/MainApplication.java
	 *  
	 *  2. Créer un fichier MANIFEST.MF dans le dossier /jar (laisser une ligne vide à la fin du fichier)
	 *  
	 *  3. Générer le fichier JAR :
	 *     CMD : cd JavaHub\jar -> jar cvfm javahub.jar MANIFEST.MF JavaHub/*.class
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to JavaHub !"); // un commentaire
		
		System.out.println("\n--- JMD L1 Variable Types ---");
        System.out.println("\n--- Primitive Data Types ---");
        PrimitiveDataTypes.main(args); // Appel d'une fonction public static void main(String[] args) {}

        System.out.println("\n--- Reference Data Types ---");
        ReferenceDataTypes referenceDataTypes = new ReferenceDataTypes();
        referenceDataTypes.reference_data_types(); // Appel d'une fonction xxx() {}
        
        System.out.println("\n--- Print Variables ---");
        String name = "Hugo";
        System.out.println("Hello " + name + " !"); // Concatenation
        int x = 10;
        int y = 15;
        System.out.println("Hello " + name + " ! Age : " + x + y); // Ajout de la valeur x + y (n'additionne pas!)
        
        // int x = 10, y = 15; Initialisation sur 1 ligne ou
        // int x, y, z;
        // x = y = z = 50; si les variables ont la même valeur
        
        System.out.println("\n--- Types Casting ---");
        TypeCasting.main(args);

        System.out.println("\n--- Variable Scope ---");
        VariableScope.main(args);
        
        System.out.println("\n--- Constants ---");
        Constants.main(args);
        System.out.println("\n-----------------------------");
        
        System.out.println("\n--- JMD L2 Operators ---");
        System.out.println("\n--- Arithmetic Operators ---");
        ArithmeticOperators.main(args);

        System.out.println("\n--- Comparison Operators ---");
        ComparisonOperators.main(args);
        
        System.out.println("\n--- Logical Operators ---");
        LogicalOperators.main(args);

        System.out.println("\n--- Bitwise Operators ---");
        BitwiseOperators.main(args);
        System.out.println("\n-----------------------------");
        
        System.out.println("\n--- JMD L3 Control Flow ---");
        System.out.println("\n--- Conditional Instructions ---");
        ConditionalInstructions.main(args);

        System.out.println("\n--- Loops ---");
        Loops.main(args);
        System.out.println("\n-----------------------------");

	}
	
}
