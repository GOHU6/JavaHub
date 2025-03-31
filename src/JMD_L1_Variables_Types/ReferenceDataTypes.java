package JMD_L1_Variables_Types;

public class ReferenceDataTypes {
	
	public void reference_data_types() {
        
		//Reference data types

		String text = "Hello, Java!";						// Chaîne de caractères
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};	// Tableau de chaîne de caractères
        int[] numbers = {1, 2, 3, 4, 5};					// Tableau de nombres
        
        System.out.println("Cars n°1 : " + cars[0]);
        
        cars[0] = "Opel";									// Changer une valeur dans un tableau
        System.out.println("New cars n°1 : " + cars[0]);
        
        System.out.println("Cars length : " + cars.length);	// Taille du tableau

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };  	// Tableau double
        System.out.println("Multidimensional Arrays : " + myNumbers[1][2]);
		
        Personne personne = new Personne("Hugo", 20);     	// Déclaration d'un objet personnalisé
        System.out.println("Name : " + personne.name + ", age : " + personne.age);
    }
}

class Personne { // Objet avec deux parametre
    String name;
    int age;
    
    public Personne(String name, int age) { // Constructeur
        this.name = name;
        this.age = age;
	}
}