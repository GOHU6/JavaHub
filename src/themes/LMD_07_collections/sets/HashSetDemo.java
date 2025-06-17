package themes.LMD_07_collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of HashSet in Java.
 * - Stores unique elements
 * - No guaranteed order
 * - Fast operations (uses hashing)
 */
public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Alice"); // Duplicate ignored
		
		System.out.println("HashSet contents: " + names); // Get names content
		System.out.println("Contains 'Bob'? " + names.contains("Bob"));
        names.remove("Bob");
        
        System.out.println("After removal: " );
		Iterator<String> iterator = names.iterator(); // Other method to get names content
	    while (iterator.hasNext()) {
	      System.out.println(iterator.next());
	    }
	}
}
