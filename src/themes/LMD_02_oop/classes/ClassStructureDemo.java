package themes.LMD_02_oop.classes;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates the basic structure of a Java class with attributes and methods
 */
public class ClassStructureDemo {

    // Instance variables (fields)
    String model;
    int year;
    
    // Default constructor (not mandatory)
    public ClassStructureDemo() {
        this.model = "Honda";
        this.year = 2002;
    }
    
    // Constructor
    public ClassStructureDemo(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Main method to test
    public static void main(String[] args) {
    	ClassStructureDemo defaultcar = new ClassStructureDemo();
        defaultcar.displayInfo();
        
        ClassStructureDemo car = new ClassStructureDemo("Toyota", 2025);
        car.displayInfo();
        
        System.out.println("\n Class structure demo complete\n\n");
    }
}