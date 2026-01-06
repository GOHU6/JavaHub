package themes.LMD_02_oop.inheritance;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-poo.htm
 * Section : 4
 * 
 * Demonstrates use of 'super' to call parent constructor and method
 */
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Name: " + name);
    }
}

public class SuperKeywordDemo extends Person {

    int age;

    SuperKeywordDemo(String name, int age) {
        super(name); // Call parent constructor
        this.age = age;
    }

    void showInfo() {
        super.showInfo(); // Call parent method
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        SuperKeywordDemo student = new SuperKeywordDemo("Alice", 22);
        student.showInfo();
        
        System.out.println("\n Super keyword demo complete\n\n");
    }
}
