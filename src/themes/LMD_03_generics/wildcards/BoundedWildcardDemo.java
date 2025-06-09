package themes.LMD_03_generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-generique.htm#generique
 * Section: 5
 *
 * Bounded wildcard
 * ? extends T allows reading elements of type T or subclasses
 * ? super T allows writing elements of type T or its superclasses
 */
public class BoundedWildcardDemo {
	
	public static void getList(List<? extends Number> numbers) { // Accepts list of any type that extends Number
		for (Number number : numbers) {
			System.out.println(number);
		}
	}
	
	public static void addNumber(List<? super Integer> list) { // Accepts list of type Number or any of its superclasses
		list.add(10);
		list.add(20);
		
        System.out.println("Added integers to list : " + list);	
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3);
		List<Double> doubleList	= Arrays.asList(1.2,1.3,1.4);
		
        System.out.println("Printing integer :");
		getList(integerList);
		
        System.out.println("Printing doubles :");
		getList(doubleList);
		
		List<Number> numberList = new ArrayList<>(); 
		addNumber(numberList);
	}
}