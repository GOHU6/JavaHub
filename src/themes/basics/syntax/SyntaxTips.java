package themes.basics.syntax;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm
 * Section 3.4
 * 
 * Type of comments
 */
public class SyntaxTips {
	
    public static void main(String[] args) {
        // One-line comment

        /*
         * Multi-line
         * comment
         */
    	
    	/**
    	  * Method comment
    	  * @param val the value to process
    	  * @since 1.0
    	  * @return the return value
    	  * @deprecated Use the new method XXX instead
    	  */
    	
    	System.out.println("// One-line comment");
    	
    	System.out.println("/*\r\n"
    			+ "         * Multi-line\r\n"
    			+ "         * comment\r\n"
    			+ "         */");
    	
    	System.out.println("/**\r\n"
    			+ "    	  * Method comment\r\n"
    			+ "    	  * @param val the value to process\r\n"
    			+ "    	  * @since 1.0\r\n"
    			+ "    	  * @return the return value\r\n"
    			+ "    	  * @deprecated Use the new method XXX instead\r\n"
    			+ "    	  */");
    	
        // int x = 10, y = 15; Initialization on 1 ligne or
        // int x, y, z;
        // x = y = z = 50; if variables have same value
    	
        System.out.println("\n✅ Syntax demo complete\n\n");
    }
}