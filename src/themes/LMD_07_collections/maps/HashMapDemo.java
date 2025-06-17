package themes.LMD_07_collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-3
 * Section: 14
 * 
 * Demonstrates the use of HashMap in Java.
 * - Stores key-value pairs
 * - Keys must be unique
 * - No guaranteed order
 */
public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> peoples = new HashMap<>();
		
		peoples.put("Charlie", 30); // key-value pairs
		peoples.put("Alice", 16);
		peoples.put("Bob", 55);
		
		System.out.println("All entries: " + peoples);
        System.out.println("Bob's age: " + peoples.get("Bob"));
        peoples.remove("Alice");
        System.out.println("After removal: " + peoples);
        
        for (String string : peoples.keySet()) { // show peoples
			System.out.println(string + " ");
		}
	}
}
