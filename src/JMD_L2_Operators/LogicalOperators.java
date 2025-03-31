package JMD_L2_Operators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean X = true, Y = false;
        System.out.println("With X = true et Y = false :");
		System.out.println("X && Y (AND) : " + (X && Y));		// et logique
		System.out.println("X || Y (OR) : " + (X || Y));		// ou inclusif
		System.out.println("!X (NOT) : " + (!X)); 				// inverseur
		
        System.out.println("!(X && Y) (NAND) : " + !(X && Y));	// négation du "et logique"
        System.out.println("!(X || Y) (NOR) : " + !(X || Y));	// négation du "ou inclusif"
        System.out.println("(X ^ Y) (XOR) : " + (X ^ Y));		// ou exclusif
        System.out.println("!(X ^ Y) (XNOR) : " + !(X ^ Y)); 	// négation du "ou exclusif"
    }
}
