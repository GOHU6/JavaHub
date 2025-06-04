package themes.LMD_02_oop.encapsulation;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Explains the different access modifiers in Java
 * - public: accessible from anywhere.
 * - protected: accessible in the same package or in subclasses.
 * - (default): accessible only in the same package.
 * - private: accessible only within the same class.
 */
public class AccessModifiersDemo {

    public int publicField = 1; // Accessible everywhere
    protected int protectedField = 2; // Accessible in the same package or by inheritance
    int defaultField = 3; // Accessible in the same package (package-private)
    private int privateField = 4; // Accessible only in this class

    public void showAccess() {
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        
        System.out.println(demo.publicField); // OK
        System.out.println(demo.protectedField); // OK (same package)
        System.out.println(demo.defaultField); // OK (same package)
        // System.out.println(demo.privateField); // Error : private

        demo.showAccess(); // Displays everything from inside the class
        
        System.out.println("\n✅ Access modifiers demo complete\n\n");
    }
}
