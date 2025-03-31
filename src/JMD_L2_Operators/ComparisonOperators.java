package JMD_L2_Operators;

public class ComparisonOperators {
	
	public static void main(String[] args) {
		
        int x = 10, y = 5;
        System.out.println("With x = 10 et y = 5 :");
        System.out.println("x == y : " + (x == y));		// égale
        System.out.println("x != y : " + (x != y));		// différent
        System.out.println("x > y : " + (x > y));		// supérieur
        System.out.println("x < y : " + (x < y));		// inférieur
        System.out.println("x >= y : " + (x >= y));		// supérieur ou égale
        System.out.println("x <= y : " + (x <= y));		// inférieur ou égale
        
        String text = "Hello Java!";
        Object obj = text;
        
        System.out.println("obj instanceof String : " + (obj instanceof String)); 		// Vérifie si 'obj' est une instance de String
        System.out.println("obj instanceof Integer : " + (obj instanceof Integer)); 	// Vérifie si 'obj' est une instance de Integer
    
    }
}
