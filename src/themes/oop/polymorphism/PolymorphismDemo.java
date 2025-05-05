package themes.oop.polymorphism;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates method overriding (runtime polymorphism)
 */
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

public class PolymorphismDemo extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Shape shape = new PolymorphismDemo(); // Upcasting
        shape.draw(); // Calls overridden method
        
        System.out.println("\n✅ Polymorphism demo complete\n\n");
    }
}
