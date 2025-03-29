package variables;

public class ConversionTypes {
	
	public static void main(String[] args) {
		
        int entier = 10;
        double decimal = entier;  // Conversion implicite (int -> double)

        double valeur = 9.7;
        int arrondi = (int) valeur; // Conversion explicite (cast) de double -> int

        System.out.println("Conversion implicite : " + decimal);
        System.out.println("Conversion explicite (cast) : " + arrondi);
	}
}
