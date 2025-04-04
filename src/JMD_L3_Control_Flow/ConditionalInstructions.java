package JMD_L3_Control_Flow;

public class ConditionalInstructions {
	
	public static void main(String[] args) {
		
		int age = 18;
        boolean isStudent = true;

        // Instruction if-else
        if (age >= 18) {
            System.out.println("You are over 18");
        } else {
            System.out.println("You are a minor");
        }
        // Autre maniere de construire un if
        String valeur = age >= 18 ? "valeur-vraie" : "valeur-fausse";
        System.out.println(valeur);

        // Instruction if-else avec logique combinée
        if (age >= 18 && isStudent) {
            System.out.println("You are a student over 18");
        } else if (age < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are not a student");
        }

        // Instruction switch-case
        String days = "Monday";
        switch (days) {
            case "Monday":
                System.out.println("It's the beginning of the week");
                break;
            case "Wednesday":
                System.out.println("It's the middle of the week");
                break;
            case "Friday":
                System.out.println("It's almost the weekend");
                break;
            default:
                System.out.println("It's another day");
                break;
        }
        
        // Nouvelle syntaxe du switch
        int position = 1;
        boolean monteSurPodium = switch (position) {
          case 1, 2, 3 -> true;
          default      -> false;
        };
        System.out.println(monteSurPodium);
        
    }
}
