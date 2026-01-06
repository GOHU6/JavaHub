package themes.LMD_06_annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-annotations.htm#annotations
 * Section: 11
 * 
 * @SuppressWarnings is used to silence compiler warnings such as raw types or unchecked operations.
 */
public class SuppressWarningsDemo {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void unsafe() {
		List list = new ArrayList();
		list.add("Hello");
		list.add(123);
		System.out.println("Raw list" + list);
	}
	
	public static void main(String[] args) {
		unsafe();
		
		System.out.println("\n Suppress warnings demo complete\n\n");

	}
}