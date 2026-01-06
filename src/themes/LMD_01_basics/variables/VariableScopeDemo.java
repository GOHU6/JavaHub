package themes.LMD_01_basics.variables;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section: 
 * 
 * Demonstrates the difference between local, instance, and static variables
 */
public class VariableScopeDemo {

	// Static variable — shared across all instances of the class
    static String appName = "JavaHub";

    // Instance variable — belongs to each object instance
    String userName = "Anonymous";

    public static void main(String[] args) {
        // Create an object to access non-static members
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.showVariableScopes();
    }

    void showVariableScopes() {
        // Local variable — declared within method, only accessible here
        int localCounter = 1;

        System.out.println("----- Variable Scope -----");
        System.out.println("Local variable (inside method): int localCounter = " + localCounter);
        System.out.println("Instance variable (per object): String userName = " + userName);
        System.out.println("Static variable (shared): String appName = " + appName);

        System.out.println("\nModifying instance and static variables...");

        userName = "Hugo";
        appName = "Java Encyclopedia";

        System.out.println("New instance variable value: " + userName);
        System.out.println("New static variable value: " + appName);

        System.out.println("\n Variable scope demo complete\n\n");
    }
}