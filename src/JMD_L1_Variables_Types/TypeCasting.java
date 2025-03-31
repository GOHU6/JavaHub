package JMD_L1_Variables_Types;

public class TypeCasting {
	
	public static void main(String[] args) {
		
        int integer = 10;
        double decimal = integer;  	// Conversion implicite (int -> double)

        double value = 9.7;
        int round = (int) value; 	// Conversion explicite (cast) de double -> int

        System.out.println("Implicit conversion : " + decimal);
        System.out.println("Cast conversion : " + round);
	}
}
