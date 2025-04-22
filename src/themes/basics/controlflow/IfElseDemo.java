package themes.basics.controlflow;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-9
 * Section: 3.9
 * 
 * Conditional structures: if / else
 */
public class IfElseDemo {
	
    public static void main(String[] args) {
    	
		int age = 18;
        boolean isStudent = true;

        // --- if/else logic ---
        if (age >= 18) {
            System.out.println("You are over 18");
        } else {
            System.out.println("You are a minor");
        }

        // --- if/ else if /else logic ---
        if (age >= 18 && isStudent) {
            System.out.println("You are a student over 18");
        } else if (age < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are not a student");
        }
        
        // Conditional assignment using ternary operator
        String value = age >= 18 ? "true" : "false";
        System.out.println("String value = age >= 18 ? \"true\" : \"false\" -> " + value);
        
        System.out.println("\n✅ IfElse demo complete\n\n");
    }
}