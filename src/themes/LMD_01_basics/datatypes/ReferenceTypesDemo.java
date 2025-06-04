package themes.LMD_01_basics.datatypes;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm
 * Section: Reference Data Types
 * 
 * Demonstrates how objects (String, Array, Object) behave as reference types
 */
public class ReferenceTypesDemo {
	
    public static void main(String[] args) {
        
    	// String is a reference type pointing to an object
        String value = "JavaHub";

        // Arrays are also reference types
        int[] numbers = {1, 2, 3};

        // Object is the superclass of all classes
        Object obj = new Object();
        
        // Null reference - points to no object
        String empty = null;

        System.out.println("----- String -----");
        System.out.println("Value: " + value);

        System.out.println("\n----- Array -----");
        System.out.println("int[] numbers: " + numbers[0] + ", " + numbers[1] + " ...");

        System.out.println("\n----- Object -----");
        System.out.println("Object class name: " + obj.getClass().getName());

        System.out.println("\n----- Null Reference -----");
        System.out.println("String empty: " + empty);
        
        System.out.println("\n✅ Reference types demo complete\n\n");
    }
}