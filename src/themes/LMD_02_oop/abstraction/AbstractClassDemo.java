package themes.LMD_02_oop.abstraction;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates use of abstract class and method
 * Abstract classes allow defining common behavior while leaving specific implementation to child classes.
 * You cannot instantiate an abstract class.
 */
abstract class Animals {
    abstract void makeSound(); // Abstract method (without body)

    void breathe() { // Concrete method (with body)
        System.out.println("Breathing...");
    }
}

public class AbstractClassDemo extends Animals {

    @Override
    void makeSound() { // Forces child classes to provide their own version !! 
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        AbstractClassDemo cat = new AbstractClassDemo();
        cat.makeSound();
        cat.breathe();
        
        System.out.println("\n✅ Abstract class demo complete\n\n");
    }
}

// public class AbstractClassDemo2 extends Animals {

//     @Override
//     void makeSound() { // Forces child classes to provide their own version !! 
//         System.out.println("Woof!");
//     }

//     ...
// }

