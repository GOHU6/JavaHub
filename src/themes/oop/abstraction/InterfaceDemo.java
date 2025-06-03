package themes.oop.abstraction;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates basic interface usage
 * Interfaces define a contract that implementing classes must follow.
 * They are used to specify what should be done not how !! 
 */
interface Animals {
    void makeSound(); // default abstract method (public and abstract)
}

class Cat implements Animals {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog implements Animals {
    public void makeSound() {
    System.out.println("Woof!");
    }
}

public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        Animals myCat = new Cat();
        Animals myDog = new Dog();

        myCat.makeSound(); // Meow!
        myDog.makeSound(); // Woof!
        
        System.out.println("\n✅ Interface demo complete\n\n");
    }
}
