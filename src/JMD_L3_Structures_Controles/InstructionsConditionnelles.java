package JMD_L3_Structures_Controles;

public class InstructionsConditionnelles {
	
	public static void main(String[] args) {
		
		int age = 18;
        boolean estEtudiant = true;

        // Instruction if-else
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }

        // Instruction if-else avec logique combinée
        if (age >= 18 && estEtudiant) {
            System.out.println("Vous êtes un étudiant majeur.");
        } else if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous n'êtes pas étudiant.");
        }

        // Instruction switch-case
        String jour = "lundi";
        switch (jour) {
            case "lundi":
                System.out.println("C'est le début de la semaine.");
                break;
            case "mercredi":
                System.out.println("C'est le milieu de la semaine.");
                break;
            case "vendredi":
                System.out.println("C'est presque le week-end.");
                break;
            default:
                System.out.println("C'est un autre jour.");
                break;
        }
    }
}
