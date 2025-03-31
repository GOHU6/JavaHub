package JMD_L1_Variables_Types;

public class PrimitiveDataTypes {
		
	public static void main(String[] args) {
		
		//Primitive data types

	    byte smallNumber = 127;      			// Entier court (-128 à 127)
	    byte byteValue = (byte) 0b00010001; 	// Valeur en binaire
	    
        short shortNumber = 32000;   			// Nombre entier (-32,768 à 32,767)
        
        int integerNumber = 10;   				// Nombre entier standard
        
        long largeNumber = 10000000000L; 		// Entier très grand (suffixe L)
        
        float decimalNumber = 5.75f; 			// Nombre décimal (suffixe f)
        
        double bigDecimal = 19.99; 				// Nombre décimal haute précision
        
        boolean isTrue = true;      			// Booléen (true ou false)
        
        char character = 'A';           		// Un caractère (lettre ou symbole)
        
        System.out.println("Small : " + smallNumber);
        System.out.println("Byte value = " + byteValue);
        System.out.println("Short : " + shortNumber);
        System.out.println("Int : " + integerNumber);
        System.out.println("Long : " + largeNumber);
        System.out.println("Float : " + decimalNumber);
        System.out.println("Double : " + bigDecimal);
        System.out.println("Boolean : " + isTrue);
        System.out.println("Char : " + character);
	}
	
}
