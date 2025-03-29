package JMD_L1_Variables;

public class VariablesReference {
	
	public void declaration_objets_reference() {
        
        // Déclaration d'un objet personnalisé
        Personne personne = new Personne("Alice", 30);

        System.out.println("Personne : " + personne.nom + ", Âge : " + personne.age);
    }
}

class Personne {
    String nom;
    int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
	}
}