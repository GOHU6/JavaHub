package themes.LMD_09_streams;

import java.util.Optional;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-streams.htm#streams
 * Section: 22
 */

public class OptionalDemo {
    public static void main(String[] args) {
        
        Optional<String> opt1 = Optional.of("Hello, World!");
        Optional<String> opt2 = Optional.empty();
        Optional<String> opt3 = Optional.ofNullable(null);
        Optional<String> opt4 = Optional.ofNullable("Optional Value");
        Optional<String> opt5 = Optional.of("Java Optional");

        System.out.println("opt1 est présent: " + opt1.isPresent());
        System.out.println("opt2 est présent: " + opt2.isPresent());
        System.out.println("opt3 est présent: " + opt3.isPresent());

        // Utilisation de ifPresent
        opt4.ifPresent(v -> System.out.println("opt4 contient: " + v));

        // Utilisation de orElse
        System.out.println("opt2 contient: " + opt2.orElse("Valeur par défaut"));
        System.out.println("opt3 contient: " + opt3.orElseGet(() -> "Valeur générée"));
        try {
           opt5.orElseThrow(() -> new Exception("opt5 est vide")); 
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        // Utilisation de map
        Optional<Integer> lengthOpt = opt1.map(String::length);
        lengthOpt.ifPresent(length -> System.out.println("Longueur de la chaîne dans opt1: " + length));

        // Utilisation de flatMap
        Optional<Optional<String>> nestedOpt = Optional.of(Optional.of("Nested Value"));
        Optional<String> flatMappedOpt = nestedOpt.flatMap(opt -> opt);     
        flatMappedOpt.ifPresent(value -> System.out.println("Valeur aplatie: " + value));

        // Utilisation de filter
        opt5.filter(v -> v.contains("Java")).ifPresent(v -> System.out.println("opt5 contient 'Java': " + v));

        System.out.println("\n Optional demo complete\n\n");
    }
}