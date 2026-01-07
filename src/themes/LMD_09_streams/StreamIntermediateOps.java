package themes.LMD_09_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-streams.htm#streams
 * Section: 22
 */

public class StreamIntermediateOps {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "date", "banana");
        System.out.println("Original: " + words);

        List<String> processed = words.stream()
                .distinct()                      // remove duplicates
                .filter(s -> s.length() > 4)     // keep words longer than 4
                .map(String::toUpperCase)        // map to upper case
                .sorted()                        // sort
                .peek(s -> System.out.println("Peek: " + s)) // only for debugging to check intermediate values
                .limit(3)                        // take first 3
                .collect(Collectors.toList());   // terminal operation

        System.out.println("Processed: " + processed);

        // flatMap example
        List<String> phrases = Arrays.asList("hello world", "java streams");
        List<String> tokens = phrases.stream()
                .flatMap(p -> Arrays.stream(p.split(" ")))
                .collect(Collectors.toList());
        System.out.println("Tokens: " + tokens);

        // skip + limit example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> sub = numbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Sub: " + sub);

        System.out.println("\n Stream intermediate operations demo complete\n\n");
    }
}