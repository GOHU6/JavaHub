package themes.LMD_03_exceptions;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-exceptions.htm#exceptions
 * Section: 9
 * 
 * Custom exceptions can be used to represent application-specific errors
 */
public class CustomExceptions {
	
	static class ParentException extends Exception { // Custom exception class
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ParentException(String e) {
			super(e);
		}
	}
	
	public static void validateAge(int age) throws ParentException{
		if(age< 18) {
			throw new ParentException("Incorrect age");
		}
	}
	
	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n✅ Custom exceptions demo complete\n\n");
	}
}