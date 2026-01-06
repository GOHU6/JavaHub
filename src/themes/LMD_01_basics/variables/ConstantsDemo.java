package themes.LMD_01_basics.variables;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section: 4.3.3
 * 
 * Demonstrates how to declare constants using the final keyword
 */
public class ConstantsDemo {
    
	public static void main(String[] args) {
        
		// Declare constants using 'final'
        final int MAX_USERS = 100;

        // Print constants
        System.out.println("Constant MAX_USERS: " + MAX_USERS);

        // Uncommenting below will cause compile-time error
        // MAX_USERS = 50;
        
        System.out.println("\n Constants demo complete\n\n");
    }
}