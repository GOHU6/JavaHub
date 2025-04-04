package JMD_L4_Functions_Methods_Class;

// Une classe incomplète pour forcer les classes filles à fournir certaines méthodes
public abstract class AbstractExample {
    
	// Méthode abstraite pas de corps ! Doit être implémentée par la classe enfant 
    public abstract void abstract_function();

    // Méthode normale peut être utilisée directement par les classes enfants
    public void no_abstract_function() {
        System.out.println("abstract class!");
    }
}
