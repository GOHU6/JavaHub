package themes.LMD_02_oop.abstraction;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates basic interface usage
 * Interfaces define a contract that implementing classes must follow.
 * They are used to specify what should be done not how !! 
 */
interface Animal {
    void makeSound(); // default abstract method (public and abstract)
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog implements Animal {
    public void makeSound() {
    System.out.println("Woof!");
    }
}

public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.makeSound(); // Meow!
        myDog.makeSound(); // Woof!
        
        System.out.println("\n✅ Interface demo complete\n\n");
    }
}
