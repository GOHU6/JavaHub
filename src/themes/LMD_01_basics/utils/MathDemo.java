package themes.LMD_01_basics.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Reference: https://www.jmdoudoux.fr/java/dej/chap-math.htm
 * Section: 8
 *
 * Demonstrates use of java.lang.Math and java.math.BigDecimal for mathematical operations.
 */
public class MathDemo {
	
    public static void main(String[] args) {

        System.out.println("----- Mathematical Constants -----");
        System.out.println("Math.PI (π) = " + Math.PI); // ~3.14159
        System.out.println("Math.E (Euler's number) = " + Math.E); // ~2.71828

        System.out.println("\n----- Basic Operation -----");
        double value = 3.0;
        System.out.println("Square root of " + value + " = " + Math.sqrt(value));
        System.out.println("Power (4^3) = " + Math.pow(4.0, 3.0));
        System.out.println("Exponential (e^4) = " + Math.exp(4.0));
        System.out.println("Natural log (ln(4)) = " + Math.log(4.0));

        System.out.println("\n----- Trigonometry -----");
        double degrees = 45.0;
        // Convert an angle from degrees to radians and compute trigonometric functions
        double radians = Math.toRadians(degrees);
        System.out.println("Angle in degrees: " + degrees + ", in radians: " + radians);
        System.out.println("sin(45°) = " + Math.sin(radians));
        System.out.println("cos(45°) = " + Math.cos(radians));
        System.out.println("tan(45°) = " + Math.tan(radians));
        
        // Inverse trigonometric functions
        System.out.println("asin(sin(45°)) = " + Math.asin(Math.sin(radians)));
        System.out.println("acos(cos(45°)) = " + Math.acos(Math.cos(radians)));
        System.out.println("atan(tan(45°)) = " + Math.atan(Math.tan(radians)));

        System.out.println("\n----- Min / Max -----");
        System.out.println("Max between 5 and 10 = " + Math.max(5, 10));
        System.out.println("Min between 7 and 14 = " + Math.min(7, 14));

        System.out.println("\n----- Rounding -----");
        double roundValue = 7.49;
        System.out.println("Value: " + roundValue);
        System.out.println("Math.round(): " + Math.round(roundValue));
        System.out.println("Math.floor(): " + Math.floor(roundValue));
        System.out.println("Math.ceil(): " + Math.ceil(roundValue));

        System.out.println("\n----- Absolute Value -----");
        double negative = -5.75;
        System.out.println("Math.abs(" + negative + ") = " + Math.abs(negative));

        System.out.println("\n----- Random number generation -----");
        System.out.println("Random number between 0 and 1: " + Math.random());

        System.out.println("\n----- Special cases -----");
        System.out.println("Math.log(0) = " + Math.log(0)); // -Infinity
        System.out.println("Math.sqrt(-1) = " + Math.sqrt(-1)); // NaN

        System.out.println("\n----- Bigdecimal rounding modes -----");
        BigDecimal decimal;

        decimal = new BigDecimal("0.222").setScale(2, RoundingMode.CEILING);
        System.out.println("CEILING of 0.222 = " + decimal);

        decimal = new BigDecimal("0.228").setScale(2, RoundingMode.DOWN);
        System.out.println("DOWN of 0.228 = " + decimal);

        decimal = new BigDecimal("0.222").setScale(2, RoundingMode.FLOOR);
        System.out.println("FLOOR of 0.222 = " + decimal);

        decimal = new BigDecimal("0.225").setScale(2, RoundingMode.HALF_UP);
        System.out.println("HALF_UP of 0.225 = " + decimal);

        decimal = new BigDecimal("0.225").setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("HALF_EVEN of 0.225 = " + decimal);

        decimal = new BigDecimal("0.222").setScale(2, RoundingMode.UP);
        System.out.println("UP of 0.222 = " + decimal);

        System.out.println("\n Math demo complete\n\n");
    }
}