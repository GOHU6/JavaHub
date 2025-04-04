package JMD_L4_Functions_Methods_Class;

public class StaticVsInstance {
	
    // Méthode statique pas besoin de créer un objet lors de l'appel
    public static void static_function() {
        System.out.println("static method!");
    }

    // Méthode d'instance nécessite un objet lors de l'appel
    public void instance_function() {
        System.out.println("instance method!");
    }
}
