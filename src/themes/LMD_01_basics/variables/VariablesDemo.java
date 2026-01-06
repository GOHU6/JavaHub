package themes.LMD_01_basics.variables;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-5
 * Section: 3.5
 * 
 * Shows how to declare and initialize variables in Java
 */
public class VariablesDemo {
    
	public static void main(String[] args) {
        
		// Declare and initialize variables
        int age = 23;                  // Integer type
        String name = "Hugo";          // Reference type
        double height = 1.76;          // Floating-point number

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        
        System.out.println("\n Variables declaration and initialization demo complete\n\n");
    }
}