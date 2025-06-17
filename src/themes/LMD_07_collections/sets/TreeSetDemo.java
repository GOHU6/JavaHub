package themes.LMD_07_collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of TreeSet in Java.
 * - Stores unique elements in natural sorted order
 * - Slower than HashSet (uses a Red-Black Tree internally)
 */
public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();
		
		names.add("Charlie"); // Last because natural sorted order
		names.add("Alice");
		names.add("Bob");
		names.add("Alice"); // Duplicate ignored
		
		System.out.println("HashSet contents: " + names); // Get names content
	}
}
