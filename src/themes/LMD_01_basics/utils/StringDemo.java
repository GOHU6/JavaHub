package themes.LMD_01_basics.utils;

import java.util.Date;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-chaines.htm
 * Section: 6
 *
 * Demonstrates core string operations in Java: creation, transformation, comparison,
 * regex, formatting, joining, and parsing.
 */
public class StringDemo {
	
    public static void main(String[] args) {

        System.out.println("----- String creation and basics -----");
        String txt = "Hello World";
        System.out.println("Concatenation: " + txt + txt);
        System.out.println("Original string: " + txt);
        System.out.println("Length: " + txt.length());
        System.out.println("Uppercase: " + txt.toUpperCase());
        System.out.println("Lowercase: " + txt.toLowerCase());
        System.out.println("Is empty: " + txt.isEmpty());
        System.out.println("Is blank: " + txt.isBlank());
        System.out.println("Character at index 1: " + txt.charAt(1));
        System.out.println("Unicode code point at index 1: " + txt.codePointAt(1));

        System.out.println("\n----- Transformation -----");
        System.out.println("Replace 'o' with 'x': " + txt.replace('o', 'x'));
        System.out.println("Replace all 'l' with 'L': " + txt.replaceAll("l", "L"));
        //add replace first
        System.out.println("Trimmed: '" + "  Hello  ".trim() + "'");
        System.out.println("Substring(0, 5): " + txt.substring(0, 5));
        System.out.println("Reversed: " + new StringBuilder(txt).reverse());
        
        String[] splitText = "test1,test2,test3".split(",");
        System.out.println("Split text: " + splitText[1]);

        System.out.println("\n----- Comparison -----");
        String txt2 = "hello world";
        System.out.println("Equals: " + txt.equals(txt2)); // More efficient
        System.out.println("Equals ignore case: " + txt.equalsIgnoreCase(txt2));
        System.out.println("== comparison (memory): " + (txt == txt2));
        System.out.println("compareTo: " + txt.compareTo(txt2));
        System.out.println("compareToIgnoreCase: " + txt.compareToIgnoreCase(txt2));

        System.out.println("\n----- Searching -----");
        System.out.println("Contains 'World': " + txt.contains("World"));
        System.out.println("Starts with 'Hell': " + txt.startsWith("Hell"));
        System.out.println("Index of 'o': " + txt.indexOf("o"));
        System.out.println("Last index of 'l': " + txt.lastIndexOf("l"));

        System.out.println("\n----- Formatting -----");
        String name = "Alice";
        System.out.println(String.format("Welcome, %s!", name));
        System.out.println("Formatted price: " + String.format("%.2f €", 1234.5678));
        System.out.println("Formatted (FR): " + String.format(Locale.FRENCH, "%,.2f", 123456.78));
        System.out.println("Formatted (US): " + String.format(Locale.US, "%,.2f", 123456.78));

        System.out.println("\n----- Regex matching -----");
        String email = "test@example.com";
        boolean isValidEmail = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,7}$");
        System.out.println("Email '" + email + "' valid: " + isValidEmail);

        System.out.println("\n----- Conversion -----");
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String fromChars = new String(chars);
        System.out.println("From char array: " + fromChars);

        System.out.println("String to int: " + Integer.parseInt("42"));

        System.out.println("\n----- Joining String -----");
        String[] words = {"Java", "is", "fun"};
        String joined = String.join(" ", words);
        System.out.println("Joined: " + joined);

        StringJoiner joiner = new StringJoiner(" - ");
        joiner.add("One").add("Two").add("Three");
        System.out.println("StringJoiner: " + joiner);

        System.out.println("\n----- Tokenization -----");
        String data = "apple,banana,orange";
        StringTokenizer tokenizer = new StringTokenizer(data, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }

        System.out.println("\n----- Escape sequences -----");
        System.out.println("Quote: \"Hello\"");
        System.out.println("Backslash: C:\\Java");
        System.out.println("Tab\tSpace");
        System.out.println("New\nLine");
        System.out.println("Euro: \u20AC");

        System.out.println("\n----- Emoji and Unicode -----");
        int codePoint = 0x1F600; // 😀
        String emoji = new String(Character.toChars(codePoint));
        System.out.println("Emoji: " + emoji);

        System.out.println("\n----- Date to String -----");
        Date now = new Date();
        System.out.println("Current date: " + now.toString());

        System.out.println("\n✅ String demo complete\n\n");
    }
}