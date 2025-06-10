package themes.LMD_05_enums;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-enums.htm#enums
 * Section: 10
 * 
 * Enums are a fixed set of constant values (typesafe alternative to constants)
 */
public class EnumBasicsDemo {
	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY
	}
	
	public static void main(String[] args) {
		
		Day today = Day.WEDNESDAY;
		
		System.out.println("Today is : " + today);
		
		System.out.println("\n✅ Enum basics demo complete\n\n");

	}
}