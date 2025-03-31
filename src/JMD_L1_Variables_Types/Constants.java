package JMD_L1_Variables_Types;

public class Constants {
	
	public static void main(String[] args) {
		
        final int FINAL_INTEGER = 100;	
        System.out.println("Final integer : " + FINAL_INTEGER);
        
        // FINAL_INTEGER = 50;  génère une erreur : impossible d'assigner une valeur à une variable finale
    }
	
	public static String FINAL_STRING = "Final string";
}
