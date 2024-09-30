import java.math.BigDecimal;

public class DoubleVsBigDecimal {

    public static void main(String[] args) {
        // Double
        double doubleA1 = 0.1;
        double doubleA2 = 0.2;
        double doubleSum = doubleA1 + doubleA2;
        System.out.println("Using Double:");
        System.out.println("0.1 + 0.2 = " + doubleSum);  // imprecise result

        // BigDecimal
        BigDecimal bigDecimalA1 = new BigDecimal("0.1");
        BigDecimal bigDecimalA2 = new BigDecimal("0.2");
        BigDecimal bigDecimalSum = bigDecimalA1.add(bigDecimalA2);
        System.out.println("Using BigDecimal:");
        System.out.println("0.1 + 0.2 = " + bigDecimalSum);  // accurate result

        // comparing division using Double vs BigDecimal
        double doubleDivide = 1.0 / 3.0;
        System.out.println("\nUsing Double (division):");
        System.out.println("1 / 3 = " + doubleDivide);

        //10: specifies the number of decimal places that the result will have.
        //BigDecimal.ROUND_HALF_UP:  a rounding method
        BigDecimal bigDecimalDivide = new BigDecimal("1.0").divide(new BigDecimal("3.0"), 10, BigDecimal.ROUND_HALF_UP);
        System.out.println("Using BigDecimal (division):");
        System.out.println("1 / 3 = " + bigDecimalDivide);
    }
}
