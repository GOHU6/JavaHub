package themes.basics.controlflow;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-9
 * Section 3.9
 * 
 * The switch statement
 */
public class SwitchDemo {
	
    public static void main(String[] args) {
    	
        int n = 3;
        String day;

        switch (n) {
            case 1: day = "Lundi"; break;
            case 2: day = "Mardi"; break;
            case 3: day = "Mercredi"; break;
            case 4: day = "Jeudi"; break;
            case 5: day = "Vendredi"; break;
            default: day = "Week-end";
        }
        System.out.println("Day of the week: " + day);
        
        // Other switch syntax
        int pos = 1;
        boolean podium = switch (pos) {
          case 1, 2, 3 -> true;
          default      -> false;
        };
        System.out.println("On the podium: " + podium);
        
        System.out.println("\n✅ Switch demo complete\n\n");
    }
}