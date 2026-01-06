package themes.LMD_04_exceptions;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-exceptions.htm#exceptions
 * Section: 9
 * 
 * Try-catch structure
 */
public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		try {
			String text = null;
            System.out.println(text.length()); // This will throw an exception
		} catch (Exception e) {
			System.out.println(e.getMessage()); // Shows only the error message
			e.printStackTrace(); // Prints full stack trace for debugging
		}
		
		System.out.println("\n Try catch demo complete\n\n");
	}
}