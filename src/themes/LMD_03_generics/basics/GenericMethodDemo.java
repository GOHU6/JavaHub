package themes.LMD_03_generics.basics;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-generique.htm#generique
 * Section: 5
 * 
 * Generic methods are declared with type parameters inside the method signature
 */
public class GenericMethodDemo {
	
	public static <T> void printArray(T[] array) { // Generic method
		for (T item : array) {
			System.out.println(item + " ");
		}
	}
	
	public static void main(String[] args) {
		
		String[] names = {"Alice", "Bob", "Charlie"}; // List of String
        Integer[] numbers = {1, 2, 3, 4, 5}; // List of Integer

        System.out.print("Names: \n");
        printArray(names);

        System.out.print("Numbers: \n");
        printArray(numbers);
	}
}