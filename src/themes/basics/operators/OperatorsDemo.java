package themes.basics.operators;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-5
 * Section: 3.6.6
 * 
 * Shows all operators (Logic, Arithmetic, Bitwise and Comparison operators)
 */
public class OperatorsDemo {
	
	public static void main(String[] args) {
		
		boolean x = true, y = false;
		
		// --- Logic operators ---
        System.out.println("----- Logic operators -----");
        System.out.println("----- x = true, y = false -----");
        System.out.println("x && y (AND) : " + (x && y));        // logical AND
        System.out.println("x || y (OR) : " + (x || y));         // inclusive OR
        System.out.println("!x (NOT) : " + (!x));                // negation (NOT)

        System.out.println("!(x && y) (NAND) : " + !(x && y));   // negation of logical AND (NAND)
        System.out.println("!(x || y) (NOR) : " + !(x || y));    // negation of inclusive OR (NOR)
        System.out.println("(x ^ y) (XOR) : " + (x ^ y));        // exclusive OR (XOR)
        System.out.println("!(x ^ y) (XNOR) : " + !(x ^ y));     // negation of exclusive OR (XNOR)
		
		int a = 10, b = 3;
        
		// --- Arithmetic operators ---
        System.out.println("\n----- Arithmetic operators -----");
        System.out.println("----- a = 10, b = 3 -----");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); 		// Integer division
        System.out.println("Modulo: " + (a % b));   		// Rest of the division
        
    	// --- Bitwise operators ---
        System.out.println("\n----- Bitwise operators -----");
        System.out.println("----- a = 10 (1010), b = 3 (0011) -----");
        System.out.println("a & b (Bitwise AND) : " + (a & b)); 	
        System.out.println("a | b (Bitwise OR) : " + (a | b)); 		
        System.out.println("a ^ b (Bitwise XOR) : " + (a ^ b)); 	
        System.out.println("~a (Bitwise Complement) : " + (~a)); 	// Invert all bits
        System.out.println("a << 1 (Left Shift) : " + (a << 1)); 	
        System.out.println("a >> 1 (Right Shift) : " + (a >> 1)); 	
        
        // --- Comparison operators ---
        System.out.println("\n----- Comparison operators -----");
        System.out.println("----- a = 10, b = 3 -----");
        System.out.println("a == b : " + (a == b));      // equal
        System.out.println("a != b : " + (a != b));      // not equal
        System.out.println("a > b : " + (a > b));        // greater than
        System.out.println("a < b : " + (a < b));        // less than
        System.out.println("a >= b : " + (a >= b));      // greater than or equal to
        System.out.println("a <= b : " + (a <= b));      // less than or equal to

        String t = "JavaHub";
        Object obj = t;
        
        System.out.println("obj instanceof String: " + (obj instanceof String)); 	// Checks if obj is an instance of String
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer)); 	// Checks if obj is an instance of Integer
	
        System.out.println("\n✅ Operators demo complete\n\n");
	}
}