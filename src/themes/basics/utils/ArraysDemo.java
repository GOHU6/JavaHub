package themes.basics.utils;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-11
 * Section: 3.11
 *
 * Demonstrates how to use all type of array
 */
public class ArraysDemo {
	
    public static void main(String[] args) {

        System.out.println("----- Array literal initialization -----");

        // Declaration + initialization with values
        int[] numbers = {30, 10, 50, 20, 40};
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("Length: " + numbers.length);
        
        // Iteration
        System.out.println("Original numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\n----- Arrays sort -----");
        Arrays.sort(numbers); // in-place sort
        System.out.println("Sorted numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\n----- Array declaration + allocation + assigment -----");

        // Declaration (less recommended form is also valid)
        int classicStyleArray[];            // valid, but less clear
        classicStyleArray = new int[5];     // allocated with default values (0)
        
        // Cleaner
        int[] allocatedArray = new int[3]; // default values = 0
        allocatedArray[0] = 100;
        allocatedArray[1] = 200;
        allocatedArray[2] = 300;

        for (int i = 0; i < allocatedArray.length; i++) {
            System.out.println("Index " + i + " = " + allocatedArray[i]);
        }

        System.out.println("\n----- Multidimensional arrays -----");

        // 2 rows, 3 columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matrix (2x3):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n----- Array of String -----");

        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("\n----- ArrayList<String> -----");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("ArrayList content:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("\nNames list size: " + names.size());
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove("Bob");
        System.out.println("After removing 'Bob': " + names);

        System.out.println("\n✅ Array demo complete\n\n");
    }
}