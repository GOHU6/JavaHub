package JMD_L5_Generic;

import java.util.List;

public class WildcardGeneric {
	
	// Générique simple
    public static <T> void simplegeneric(T simplegeneric) {
        System.out.println("Simple : " + simplegeneric);
    }

    // Wildcard
    public static void showlist(List<?> list) {
        for (Object o : list) {
            System.out.println("List : " + o);
        }
    }

    // Borné supérieur extends
    public static void shownumber(List<? extends Number> numbers) {
        for (Number n : numbers) {
            System.out.println("Numbers : " + n);
        }
    }

    // Borné inférieur super
    public static void addinteger(List<? super Integer> list) {
    	list.add(10);
    	list.add(20);
    }
}
