package JMD_L1_Variables;

public class PorteeVariables {
	
	static int varGlobale = 100; // Variable globale

	public static void main(String[] args) {
		
        int varLocale = 50; // Variable locale

        System.out.println("Variable locale : " + varLocale);
        System.out.println("Variable globale : " + varGlobale);

        afficher_variable();
    }

    public static void afficher_variable() {
        System.out.println("Accès à la variable globale : " + varGlobale);
        // System.out.println(varLocale);  // ERREUR : varLocale n'existe pas ici 
    }
}
