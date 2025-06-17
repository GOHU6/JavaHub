package themes.LMD_07_collections.maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of TreeMap in Java.
 * - Stores entries sorted by keys (natural order)
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> peoples = new TreeMap<>();
		
		peoples.put("Charlie", "Poise");
		peoples.put("Alice", "Mandin");
		peoples.put("Bob", "Ricard");
		
		System.out.println("Sorted entries: " + peoples); // Sorted by keys
	}
}
