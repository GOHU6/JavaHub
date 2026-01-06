package themes.LMD_01_basics.controlflow;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-9
 * Section: 3.9
 * 
 * Loops
 */
public class LoopsDemo {
	
    public static void main(String[] args) {
    	
    	// --- For Loops ---
        System.out.println("for loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
        }
        
        System.out.println("for loop with continue and break:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                // Skip the rest of the loop body and continue with the next iteration
                continue;
            }
            if (i == 3) {
                // Exit the loop entirely when the target condition is met
                break;
            }
        }
        
    	// --- For each Loops ---
        System.out.println("\nfor each loop:");
        int[] array = {1, 2, 3, 4, 5};
        for (int number : array) {
            System.out.println("number: " + number);
        }
        
        // --- While Loops ---
        System.out.println("\nwhile loop:");
        int j = 0;
        while (j < 3) {
            System.out.println("j: " + j);
            j++;
        }

        // --- Do While Loops ---
        System.out.println("\ndo...while loop:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 3);
        
        System.out.println("\n Loops demo complete\n\n");
    }
}