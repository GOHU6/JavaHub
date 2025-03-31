package JMD_L2_Operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
  
        int x = 5, y = 3; // 5 = 0101, 3 = 0011
        System.out.println("With x = 5 (0101) et y = 3 (0011) :");
        System.out.println("x & y (Bitwise AND) : " + (x & y)); 	// 0001 = 1
        System.out.println("x | y (Bitwise OR) : " + (x | y)); 		// 0111 = 7
        System.out.println("x ^ y (Bitwise XOR) : " + (x ^ y)); 	// 0110 = 6
        System.out.println("~x (Bitwise Complement) : " + (~x)); 	// Inverse tous les bits
        System.out.println("x << 1 (Left Shift) : " + (x << 1)); 	// 1010 = 10
        System.out.println("x >> 1 (Right Shift) : " + (x >> 1)); 	// 0010 = 2
    }
}
