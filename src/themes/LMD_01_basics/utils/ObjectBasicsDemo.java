package themes.LMD_01_basics.utils;

import java.util.ArrayList;

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

        // Access fields
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old.");

        // Reference behavior
        Person p3 = p1; // p3 refers to the same object as p1
        p3.setName("ChangedName");

        System.out.println("After modifying p3:");
        System.out.println("p1.name = " + p1.getName()); // Affected!
        System.out.println("p3.name = " + p3.getName()); // Same reference

        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Alice", 28));
        peoples.add(new Person("Bob", 35));
        peoples.add(new Person("Charlie", 22));

        // Get all people
        for (Person p : peoples) {
            p.sayHello();
        }

        // Get people by index
        peoples.get(0).setName("Alicia");

        System.out.println("\n✅ Object demo complete\n\n");
    }
}

// Inner class used for demonstration
class Person {
    private String name; // without private ← package-private but not recommended
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name){
        this.name = name;
    } 

    // Getter for age
    public int getAge() {
        return age;
    }

    // Instance method
    void sayHello() {
        System.out.println("Hello, my name is " + name + "!");
    }
}