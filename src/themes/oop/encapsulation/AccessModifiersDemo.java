package themes.oop.encapsulation;

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

    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3; // package-private
    private int privateField = 4;

    public void showAccess() {
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.showAccess();
        
        System.out.println("\n✅ Access modifiers demo complete\n\n");
    }
}
