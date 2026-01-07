package themes.LMD_09_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-streams.htm#streams
 * Section: 22
 */

public class StreamCreationDemo {
    public static void main(String[] args) {
        // From values
        Stream<String> s1 = Stream.of("a", "b", "c");
        s1.forEach(System.out::println);

        // From array
        String[] arr = {"x", "y", "z"};
        Arrays.stream(arr).forEach(e -> System.out.println("arr: " + e));

        // From collection
        List<Integer> nums = List.of(1, 2, 3, 4);
        nums.stream().map(n -> n * 2).forEach(n -> System.out.println("dbl: " + n));

        // Primitive stream
        IntStream.range(0, 5).forEach(i -> System.out.println("i: " + i));

        // Infinite streams (limited)
        Stream.generate(Math::random).limit(3).forEach(r -> System.out.println("rand: " + r));
        Stream.iterate(1, n -> n + 2).limit(5).forEach(n -> System.out.println("odd: " + n));

        // Builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one").add("two").add("three");
        builder.build().forEach(s -> System.out.println("b: " + s));

        System.out.println("\n Stream creation demo complete\n\n");
    }
}