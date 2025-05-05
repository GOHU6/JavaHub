package themes.oop.abstraction;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates basic interface usage
 * Interfaces define a contract that implementing classes must follow.
 * They are used to specify what should be done not how.
 */
interface Vehicle {
    void drive();
    int getSpeed();
}

public class InterfaceDemo implements Vehicle {

    private int speed = 60;

    // Mandatory
    public void drive() {
        System.out.println("Driving a car");
    }
    
    // Mandatory
    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        InterfaceDemo car = new InterfaceDemo();
        car.drive();
        System.out.println("Speed: " + car.getSpeed() + " km/h");
        
        System.out.println("\n✅ Interface demo complete\n\n");
    }
}
