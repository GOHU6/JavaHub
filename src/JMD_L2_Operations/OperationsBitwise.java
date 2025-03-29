package JMD_L2_Operations;

public class OperationsBitwise {
	
	public static void main(String[] args) {
  
        int x = 5, y = 3; // 5 = 0101 en binaire, 3 = 0011 en binaire
        System.out.println("Pour x = 5 (0101 en binaire) et y = 3 (0011 en binaire) :");
        System.out.println("x & y (ET bit à bit) : " + (x & y)); // 0001 = 1
        System.out.println("x | y (OU bit à bit) : " + (x | y)); // 0111 = 7
        System.out.println("x ^ y (XOR bit à bit) : " + (x ^ y)); // 0110 = 6
        System.out.println("~x (Complément à 1) : " + (~x)); // Inverse tous les bits
        System.out.println("x << 1 (Décalage à gauche) : " + (x << 1)); // 1010 = 10
        System.out.println("x >> 1 (Décalage à droite) : " + (x >> 1)); // 0010 = 2
    }
}
