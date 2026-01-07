package themes.LMD_09_streams;

import java.util.*;
import java.util.stream.*;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-streams.htm#streams
 * Section: 22
 */

public class StreamTerminalOps {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Eve", "Bob");
        System.out.println("Names:");
        names.stream().forEach(System.out::println);

        long countDistinct = names.stream().distinct().count();
        System.out.println("\nDistinct count: " + countDistinct);

        Optional<String> first = names.stream().findFirst();
        System.out.println("First: " + first.orElse("none"));

        Optional<String> anyBob = names.stream().filter(s -> s.equals("Bob")).findAny();
        System.out.println("Found Bob: " + anyBob.isPresent());

        boolean anyStartsWithC = names.stream().anyMatch(s -> s.startsWith("C"));
        boolean allLengthGe2 = names.stream().allMatch(s -> s.length() >= 2);
        boolean noneStartsWithZ = names.stream().noneMatch(s -> s.startsWith("Z"));
        System.out.println("Any starts with C: " + anyStartsWithC);
        System.out.println("All length >=2: " + allLengthGe2);
        System.out.println("None starts with Z: " + noneStartsWithZ);

        // mapping and collecting
        List<String> upper = names.stream()
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());
        System.out.println("\nUppercase: " + upper);

        String joined = names.stream()
                            .distinct()
                            .collect(Collectors.joining(", "));
        System.out.println("Joined distinct: " + joined);

        // numeric terminal ops
        IntStream nums = IntStream.of(3, 7, 2, 9, 4);
        int sum = nums.sum();
        System.out.println("\nSum: " + sum);

        IntSummaryStatistics stats = IntStream.of(3, 7, 2, 9, 4).summaryStatistics();
        System.out.printf("Min: %d, Max: %d, Avg: %.2f, Count: %d%n", stats.getMin(), stats.getMax(), stats.getAverage(), stats.getCount());

        // reduction example
        Optional<Integer> product = Stream.of(3, 4, 5).reduce((a, b) -> a * b);
        System.out.println("Product (reduce): " + product.orElse(0));

        System.out.println("\n Stream terminal operations demo complete\n\n");
    }
}