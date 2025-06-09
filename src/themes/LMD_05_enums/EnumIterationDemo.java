package themes.LMD_05_enums;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-enums.htm#enums
 * Section: 10
 * 
 * How to iterate over enum constants using values()
 */
public class EnumIterationDemo {
	
	enum Direction {
		NORTH, EAST, SOUTH, WEST
	}
	
	public static void main(String[] args) {
		for (Direction dir : Direction.values()) {
			System.out.println(dir + " (ordinal: " + dir.ordinal() + ")");
		}
	}
}