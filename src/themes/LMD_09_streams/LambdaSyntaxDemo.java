package themes.LMD_09_streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-streams.htm#streams
 * Section: 22
 */

public class LambdaSyntaxDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack", "Anna", "Aaron");

        System.out.println("Noms en majuscules :");
        names.forEach(name -> System.out.println(name.toUpperCase()));
        // names.forEach(System.out::println);

        Predicate<String> startsWithA = name -> name.startsWith("A");
        System.out.println("\nNoms commençant par A :");
        names.stream()
            .filter(startsWithA)
            .forEach(System.out::println);

        Consumer<String> printName = name -> System.out.println("Nom: " + name);
        System.out.println("\nAffichage des noms avec un Consumer :");
        names.forEach(printName);

        System.out.println("\n Lambda syntax demo complete\n\n");

    }
}