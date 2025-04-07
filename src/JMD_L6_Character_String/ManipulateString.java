package JMD_L6_Character_String;

import java.util.Locale;

public class ManipulateString {
	
	public static void main(String[] args) {
		
		String txt = "Hello World";
		
		String replacetxt = "Java Java Java".replace('a','o'); 	// Fonction permet de remplacer des lettres
		System.out.println(replacetxt);
		
		System.out.println("\"Hello\"" + "\'here\'");	// Séquence d'échappement pour afficher les " et les '
		 
	    System.out.println("c:\\temp");					// Séquence d'échappement pour afficher les \
	    
	    System.out.println("\tHello tab");				// Séquence d'échappement tabulation
	    
	    System.out.println("\nHello line break \n");	// Séquence d'échappement saut de ligne
	    
	    System.out.println("10 \u20AC"); 				// Séquence d'échappement caractères ASCII
	    
	    int ch = 0x1F4A9; 
	    String s = new String(Character.toChars(ch));
	    System.out.println(s);							// Pour afficher un emoji

		//System.out.println("\uD83D\uDCA9");			// Autre méthode avec le code ASCII
	    
	    System.out.println(txt.toUpperCase());			// Texte en majuscule				
	    System.out.println(txt.toLowerCase());			// Texte en minuscule
	    System.out.println(txt.trim());					// Suppression des espaces avant et après le texte 				

	    char[] chars = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
	    String c = new String(chars);
	    System.out.println(c);							// Utilisation d'un constructeur

		String txt2 = "Hello wOrLd";
		System.out.println(txt.equals(txt2));
		System.out.println(txt.equalsIgnoreCase(txt2));	// Ignore si maj ou min
		
		System.out.println(txt.compareTo(txt2));		// Retourne 0 si les deux chaînes sont égales
		System.out.println(txt.compareToIgnoreCase(txt2));	
		
	    String name = "Hugo";
	    String txt3 = String.format("Hello %s", name);	// %s prend la valeur après la virgule
	    System.out.println(txt3);
		
	    String format = "%,f meters";
	    String txt4 = String.format(Locale.FRENCH, format, 12345.67); // format francais avec la ,
	    System.out.println(txt4);
	    txt4 = String.format(Locale.ENGLISH, format, 12345.67);		// format anglais avec le .
	    System.out.println(txt4);
	    
	    double price = 1234.5678;
	    System.out.println(String.format("%.2f \u20AC", price)); // %.2f = deux chiffres après la virgule

	    System.out.println(txt.substring(5));		// Toutes les lettres après le 5eme caracteres
	    System.out.println(txt.substring(0, 3));	// Lettres en commencant par le premier jusqu'au 3eme 
	}
}
