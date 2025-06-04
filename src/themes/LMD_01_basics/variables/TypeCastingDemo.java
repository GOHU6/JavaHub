package themes.LMD_01_basics.variables;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section: 4.2.7 Type Casting
 * 
 * Shows implicit (widening) and explicit (narrowing) conversions
 */
public class TypeCastingDemo {
    
	public static void main(String[] args) {
        
		// Implicit Casting (Widening): small -> large
        int small = 100;
        double widened = small; // Automatically converts to double

        // Explicit Casting (Narrowing): large -> small
        double preciseValue = 123.987;
        int narrowed = (int) preciseValue; // Fractional part is lost

        // Casting between characters and integers
        char letter = 'A';
        int ascii = letter; // Implicit char to int
        char backToChar = (char) 66; // Explicit int to char

        // Print results with explanations
        System.out.println("----- Implicit Casting (Widening) -----");
        System.out.println("int small = 100;");
        System.out.println("double widened = small; → " + widened);

        System.out.println("\n----- Explicit Casting (Narrowing) -----");
        System.out.println("double preciseValue = 123.987;");
        System.out.println("int narrowed = (int) preciseValue; → " + narrowed);

        System.out.println("\n----- Char <-> int casting -----");
        System.out.println("char letter = 'A'; → ASCII = " + ascii);
        System.out.println("char from 66 = (char) 66; → " + backToChar);

        System.out.println("\n✅ Type casting demo complete\n\n");
	}
}