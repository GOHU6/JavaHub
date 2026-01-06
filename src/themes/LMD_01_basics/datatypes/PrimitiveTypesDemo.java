package themes.LMD_01_basics.datatypes;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-5
 * Section: 3.5.2 - Primitive Data Types
 * 
 * Showcases all Java primitive types
 */
public class PrimitiveTypesDemo {
    
	public static void main(String[] args) {
        
        // --- Integer types ---
        byte b = 127; 								// max value for byte
        byte byteValue = (byte) 0b00010001; 		// binary literal, cast to byte
        short s = 32000; 							// you can use underscores for readability !
        int i = 1_000_000;
        long l = 9_223_372_036_854_775_807L; 		// long literal must end with L

        // --- Floating-point types ---
        float f = 3.14f; 							// float literal with 'f' suffix
        double d = 3.141592653589793; 				// double is the default for floating points

        // --- Character type ---
        char c = 'A'; 								// stores a single 16-bit Unicode character
        char unicodeChar = '\u03A9'; 				// Greek Omega (Ω)

        // --- Boolean type ---
        boolean flag = true; 						// true or false only

        System.out.println("----- Integer types -----");
        System.out.println("byte b = " + b + " -> 8-bit signed integer (range: -128 to 127)");
        System.out.println("byte from binary (0b00010001): " + byteValue);
        System.out.println("short s = " + s + " -> 16-bit signed integer (range: -32,768 to 32,767)");
        System.out.println("int i = " + i + " -> 32-bit signed integer");
        System.out.println("long l = " + l + " -> 64-bit signed integer (max value)");

        System.out.println("\n----- Floating-point types -----");
        System.out.println("float f = " + f + " -> 32-bit floating point (single precision)");
        System.out.println("double d = " + d + " -> 64-bit floating point (double precision)");

        System.out.println("\n----- Character type -----");
        System.out.println("char c = " + c + " -> single Unicode character or symbol");
        System.out.println("char unicodeChar -> Unicode for Omega (Ω): " + unicodeChar);

        System.out.println("\n----- Boolean type -----");
        System.out.println("boolean flag = " + flag + " -> represents logical true/false values");

        System.out.println("\n Primitive types demo complete\n\n");
    }
}