package themes.basics.utils;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-poo.htm#poo-2
 * Section: 4.2
 *
 * Demonstrates creation and usage of custom Java objects
 */
public class ObjectBasicsDemo {
	
    public static void main(String[] args) {

        System.out.println("----- Object basics -----");

        // Create Person objects
        Person p1 = new Person("Alice", 28);
        Person p2 = new Person("Bob", 35);

        // Call methods
        p1.sayHello();
        p2.sayHello();

        // Access fields
        System.out.println(p1.name + " is " + p1.age + " years old.");
        System.out.println(p2.name + " is " + p2.age + " years old.");

        // Reference behavior
        Person p3 = p1; // p3 refers to the same object as p1
        p3.name = "ChangedName";

        System.out.println("After modifying p3:");
        System.out.println("p1.name = " + p1.name); // Affected!
        System.out.println("p3.name = " + p3.name); // Same reference

        System.out.println("\n✅ Object demo complete\n\n");
    }
}

// Inner class used for demonstration
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }

    // Instance method
    void sayHello() {
        System.out.println("Hello, my name is " + name + "!");
    }
}