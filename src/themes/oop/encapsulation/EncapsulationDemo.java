package themes.oop.encapsulation;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates private fields and public getters/setters
 */
public class EncapsulationDemo {

    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationDemo person = new EncapsulationDemo();
        person.setName("Bob");
        person.setAge(30);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        
        System.out.println("\n✅ Encapsulation demo complete\n\n");
    }
}
