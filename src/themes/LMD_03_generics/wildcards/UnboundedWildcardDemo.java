package themes.LMD_03_generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-generique.htm#generique
 * Section: 5
 *
 * Unbounded wildcard <?> allows passing a list of any type to a method
 */
public class UnboundedWildcardDemo {
	
	public static void getList(List<?> l){ // List of any type
		for (Object object : l) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Marc");
		getList(names);
		
		List<Integer> numbers = Arrays.asList(1,2,3);
		getList(numbers);
		
		System.out.println("\n Unbounded wildcard demo complete\n\n");

	}
}