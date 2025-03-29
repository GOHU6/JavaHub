package variables;

public class VariablesPrimitives {
		
	public static void main(String[] args) {
		   
	    byte petitNombre = 127;      // Entier court (-128 à 127)
	    byte valeurByte = (byte) 0b00010001; // Valeur en binaire
        short nombreCourt = 32000;   // Nombre entier (-32,768 à 32,767)
        int nombreEntier = 10;   // Nombre entier standard
        long grandNombre = 10000000000L; // Entier très grand (suffixe L)
        
        float nombreDecimal = 5.75f; // Nombre décimal (suffixe f)
        double grandDecimal = 19.99; // Nombre décimal haute précision
        
        boolean estVrai = true;      // Booléen (true ou false)
        
        char lettre = 'A';           // Un caractère
        String message = "Hello world !"; // Un texte

        System.out.println("Byte : " + petitNombre);
        System.out.println("valeurByte = " + valeurByte);
        System.out.println("Short : " + nombreCourt);
        System.out.println("Int : " + nombreEntier);
        System.out.println("Long : " + grandNombre);
        System.out.println("Float : " + nombreDecimal);
        System.out.println("Double : " + grandDecimal);
        System.out.println("Boolean : " + estVrai);
        System.out.println("Char : " + lettre);
        System.out.println("Char : " + message);
        System.out.println("String : " + final_msg);
	}
	
	public static final String final_msg = "Un texte final"; // Une constante (final) qui ne peux pas etre modifiée
}
