package JMD_L1_Variables_Types;

public class VariableScope {
	
	static int varGlobal = 100; 				// Variable globale

	public static void main(String[] args) {
		
        int varLocal = 50; 						// Variable locale

        System.out.println("Local var : " + varLocal);
        System.out.println("Global var : " + varGlobal);

        afficher_variable();
    }

    public static void afficher_variable() {
        System.out.println("Global variable access : " + varGlobal);
        // System.out.println(varLocal);  // ERREUR : varLocale n'existe pas ici 
    }
}
