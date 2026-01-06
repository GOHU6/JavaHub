package themes.LMD_04_exceptions;

import java.io.IOException;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-exceptions.htm#exceptions
 * Section: 9
 * 
 * Throw keyword
 * Method may throw a checked exception which must be handled by the caller.
 */
public class ThrowsKeywordDemo {
	
	public static void IOExceptionMethod() throws IOException {
		throw new IOException("IO problem"); // This will throw an exception
	}
	
	public static void main(String[] args) {
		
		try {
			IOExceptionMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n Throws keyword demo complete\n\n");
	}
}