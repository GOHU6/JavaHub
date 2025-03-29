package JMD_L2_Operations;

public class OperationsRelationnelles {
	
	public static void main(String[] args) {
		
        int x = 10, y = 5;
        System.out.println("Pour x = 10 et y = 5 :");
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
        
        String message = "Bonjour Java!";
        Object obj = message;
        
        System.out.println("obj instanceof String : " + (obj instanceof String)); // Vérifie si 'obj' est une instance de String
        System.out.println("obj instanceof Integer : " + (obj instanceof Integer)); // Vérifie si 'obj' est une instance de Integer
    
    }
}
