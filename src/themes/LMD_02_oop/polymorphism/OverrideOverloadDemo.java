package themes.LMD_02_oop.polymorphism;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 */
public class OverrideOverloadDemo {

    // Overloaded method (compile-time polymorphism)
    void show(int num) {
        System.out.println("Number: " + num);
    }

    void show(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        OverrideOverloadDemo demo = new OverrideOverloadDemo();
        demo.show(42);
        demo.show("Java");
        
        System.out.println("\n✅ Override overload demo complete\n\n");
    }
}
