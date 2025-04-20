package JMD_L6_Character_String;

import java.util.Date;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ManipulateString {
	
	public static void main(String[] args) {
		
		String txt = "Hello World";
		
		String replacetxt = "Java Java Java".replace('a','o'); 						// Fonction permet de remplacer des lettres
		System.out.println("Replace txt : " + replacetxt);
		String replacealltxt = "Java Java Java".replaceAll("va","ro"); 				// Fonction permet de remplacer une chaine
		System.out.println("Replace all txt : " + replacealltxt);
		String replacefirsttxt = "Java Java Java".replaceFirst("va","ro"); 			// Fonction permet de remplacer la premiere chaine
		System.out.println("Replace first txt : " + replacefirsttxt);
		String replacelastttxt = "Java Java Java".replaceFirst("va$","ro"); 		// Fonction permet de remplacer la derniere chaine
		System.out.println("Replace last txt : " + replacelastttxt);

		System.out.println("Java escape sequences : " + "\"Hello\"" + "\'here\'");	// Séquence d'échappement pour afficher les " et les '
		 
	    System.out.println("Java escape sequences : " + "c:\\temp");				// Séquence d'échappement pour afficher les \
	    
	    System.out.println("Java escape sequences : " + "\tHello tab");				// Séquence d'échappement tabulation
	    
	    System.out.println("Java escape sequences : " + "\nHello line break \n");	// Séquence d'échappement saut de ligne
	    
	    System.out.println("Java escape sequences : " + "10 \u20AC"); 				// Séquence d'échappement caractères ASCII
	    
	    int ch = 0x1F4A9; 
	    String e = new String(Character.toChars(ch));
	    System.out.println("Emoji : " + e);											// Pour afficher un emoji
		//System.out.println("Emoji : " + "\uD83D\uDCA9");							// Autre méthode avec le code ASCII
	    
	    System.out.println("Upper case : " + txt.toUpperCase());					// Texte en majuscule				
	    System.out.println("Lower case : " + txt.toLowerCase());					// Texte en minuscule
	    
	    System.out.println("Trim : " + txt.trim());									// Suppression des espaces avant et après le texte 				

	    char[] chars = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
	    String c = new String(chars);
	    System.out.println("Constructor :" + c);									// Utilisation d'un constructeur

		String txt2 = "Hello wOrLd";
		System.out.println("Equals : " + txt.equals(txt2));
		System.out.println("Equals ignore case : " + txt.equalsIgnoreCase(txt2));	// Ignore si maj ou min
		
		System.out.println("Compare to : " + txt.compareTo(txt2));					// Retourne 0 si les deux chaînes sont égales
		System.out.println("Compare to ignore case : " + txt.compareToIgnoreCase(txt2));	
		
	    String name = "Hugo";
	    String txt3 = String.format("Hello %s !", name);							// %s prend la valeur après la virgule
	    System.out.println("String format : " + txt3);
		
	    String format = "%,f meters";
	    String txt4 = String.format(Locale.FRENCH, format, 12345.67); 				// format francais avec la ,
	    System.out.println("String format Locale.FRENCH : " + txt4);
	    txt4 = String.format(Locale.ENGLISH, format, 12345.67);						// format anglais avec le .
	    System.out.println("String format Locale.ENGLISH : " + txt4);
	    
	    double price = 1234.5678;
	    System.out.println("String format : " + String.format("%.2f \u20AC", price)); // %.2f = deux chiffres après la virgule

	    System.out.println("Substring : " + txt.substring(5));						// Toutes les lettres après le 5eme caracteres
	    System.out.println("Substring 2 param : " + txt.substring(0, 3));			// Lettres en commencant par le premier jusqu'au 3eme 
	    
	    System.out.println("Length : " + txt.length());								// Longueur du texte
	    
	    String[] splittxt = "test1,test2,test3".split(",");							// Découpage d'une chaîne de caractères
	    System.out.println("Split : " + splittxt[1]);
	    	 
	    System.out.println("Contains : " + txt.contains("Java"));   				// Vérification du contenu d'une chaîne
	    
	    System.out.println("Starts With : " + txt.startsWith("Ja"));					// Caractère se trouvant à l'index fourni en paramètre
	    
	    System.out.println("IndexOf : " + txt.indexOf("o"));   						// Index de la première occurrence de la chaîne
	    System.out.println("Last index of : " + txt.lastIndexOf("l"));				// Index de la derniere occurrence de la chaîne
	    
	    System.out.println("Char at : " + txt.charAt(6));							// Caractère se trouvant à l'index fourni en paramètre
	    
	    System.out.println("Code point at : " + txt.codePointAt(6));				// Codepoint Unicode du caractère se trouvant à l'index

	    System.out.println("Code point before : " + txt.codePointBefore(6));		// Codepoint Unicode du caractère se trouvant avant l'index

	    System.out.println("Trim : " + "*" + " trim function ".trim() + "*");		// Espace au début et/ou en fin de chaîne sont retirés
	    
	    System.out.println("is Empty : " + txt.isEmpty());							// Test d'une chaîne de caractères vide
	    System.out.println("is Blank : " + txt.isBlank());							// Test d'une chaîne de caractères vide ou ne contient que des espaces

	    Date now = new Date();
	    System.out.println("Date : " + now.toString());								// Date en String
	    System.out.println("Parse Int : " + Integer.parseInt("175"));				// String en Integer

	    StringJoiner joiner = new StringJoiner(",", "[", "]");						// Concaténer chaînes de caractères avec un séparateur, un préfixe et un suffixe
	    joiner.add("1")
	          .add("2")
	          .add("3");
	    System.out.println("String Joiner : " + joiner.toString());
	    
	    String[] joinarray = { "1", "2", "3" };										// Concaténer chaînes de caractères avec un séparateur
	    String join = String.join(", ", joinarray);
	    System.out.println("Join : " + join);
	    //List<String> valeurs = List.of("1", "2", "3");							// Autre maniere avec List.of
	    //String chaine = String.join(", ", valeurs);
	    
	    StringTokenizer st = new StringTokenizer("flight 1,flight 2,flight 3,flight 4",",");
	    while (st.hasMoreTokens()) {
	    	System.out.println((st.nextToken()).toString());							// Découper différentes portions d'une chaîne de caractères en fonction d'un séparateurs
	    }
	    
	    
	}
}
