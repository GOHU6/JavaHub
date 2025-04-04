package JMD_L4_Functions_Methods_Class;

// Un contrat qui définit ce qu'une classe doit faire mais pas comment
public interface InterfaceExample {
	
	// Méthode sans corps (implicitement publique et abstraite)
    void test();

    default void default_function() {
        System.out.println("default method in interface");
    }
}
