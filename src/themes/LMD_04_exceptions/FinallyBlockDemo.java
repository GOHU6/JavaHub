package themes.LMD_04_exceptions;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-exceptions.htm#exceptions
 * Section: 9
 * 
 * Try-catch-finally structure
 * The finally block is always executed whether or not an exception is thrown
 */
public class FinallyBlockDemo {
	
	public static void main(String[] args) {
		String text;
		try {
			text = null;
			System.out.println(text.length()); // This will throw an exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // always executed
			System.out.println("finally block");
			text = "finally";
		}
		
		System.out.println("Program continues after " + text);
		
		System.out.println("\n✅ Finally block demo complete\n\n");
	}
}