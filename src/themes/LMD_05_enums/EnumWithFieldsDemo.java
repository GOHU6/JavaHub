package themes.LMD_05_enums;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-enums.htm#enums
 * Section: 10
 * 
 * Enums can have fields, constructors and methods
 */
public class EnumWithFieldsDemo {
	
	enum Planet {
		
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6);

        private final double mass;   // in kilograms
        private final double radius; // in meters

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public double surfaceGravity() {
            final double G = 6.67300E-11;
            return G * mass / (radius * radius);
        }
    }
	
	public static void main(String[] arg) {
		
		for (Planet p : Planet.values()) {
            System.out.printf("%s: gravity = %.2f m/s²%n", p, p.surfaceGravity());
        }
		
		System.out.println("\n Enum with fields demo complete\n\n");

	}
}