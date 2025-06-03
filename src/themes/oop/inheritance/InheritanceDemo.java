package themes.oop.inheritance;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates single inheritance in Java
 */
class Animals { // Super class
    void eat() {
        System.out.println("This animal eats food");
    }
}

public class InheritanceDemo extends Animals { // Child class

    void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        InheritanceDemo dog = new InheritanceDemo();
        dog.eat();   // Inherited method
        dog.bark();  // Own method
        
        System.out.println("\n✅ Inheritance demo complete\n\n");
    }
}