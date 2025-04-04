package JMD_L1_Variables_Types;

import java.util.ArrayList;
import java.util.Arrays;

public class ReferenceDataTypes {
	
	public static void main(String[] args) {
        
		//Reference data types

		String text = "Hello, Java!";						// Chaîne de caractères
		
		System.out.println("/n----------------------------------/n");
		
		int number[];         								// Tableau déclaration 
		number = new int[10]; 								// Tableau allocation
		number[0] = 2;											
		
		// Autre maniere de faire
        int[] numbers = {1, 2, 3, 12, 5};					// Initialisation explicite d'un tableau
        Arrays.sort(numbers);								// Tableau trié
        System.out.println("Tab : " + Arrays.toString(numbers));

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};	// Tableau de chaîne de caractères
        System.out.println("Cars n°1 : " + cars[0]);		// Premier élément de la liste
        
        cars[0] = "Opel";									// Changer une valeur dans un tableau
        System.out.println("New cars n°1 : " + cars[0]);
        
        System.out.println("Cars length : " + cars.length);	// Taille du tableau

        int[][] tab = {										// Tableau double dimmension
			{1, 2, 3, 4}, 
			{5, 6, 7} 
		};  	
        System.out.println("Multidimensional Arrays : " + tab[1][2]);			// 2eme ligne 3eme colonne
        System.out.println("Complete matrix : " + Arrays.deepToString(tab)); 	// Matrice complète
        
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Hugo");								// Ajout d'un élément à arraylist
        System.out.println("Array list: " + arraylist);
        arraylist.remove("Hugo");							// Suppression d'un élément à arraylist     
        
        System.out.println("/n----------------------------------/n");
        
        Personne p1 = new Personne("Hugo", 20);     	// Déclaration d'un objet personnalisé
        System.out.println("Name : " + p1.name + ", age : " + p1.age);
        
        Personne p2 = new Personne("Clara", 25);     	// Déclaration d'un objet personnalisé
        System.out.println(p1.getClass().equals(p2.getClass()));  // Si p2 était String et non un objet Personne alors false
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

class MaClasse { // Explication de this.
	String chaine = " test " ;
	public String getChaine() { return chaine; } 
	// est équivalent à public String getChaine() { return this.chaine; } 
}