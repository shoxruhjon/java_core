package xshohrukh;

public class ArithmeticOperators {

    public static void main(String[] args) {
        /*
        // sub
        int x = 2;
        int y = 4;
        int z = x - y; // +, *, /
        System.out.println(z);
        */
        /*
        // mul
        int x = 5;
        int y = 2;
        int z = x / y;
        System.out.println(z);
        */

        // modulus %
        int x = 8;
        int y = 3;
        int remainder = x % y;
        //System.out.println(remainder);
        //int error = x / 0;
        //System.out.println(error);
        double a = 0D;
        double zero = 0D;
        double divideByZero = a / zero;
        //double positiveInfinity = Double.POSITIVE_INFINITY;
        //System.out.println(positiveInfinity);
        //double negativeInfinity = Double.NEGATIVE_INFINITY;
        //System.out.println(negativeInfinity);
        double naN = Double.NaN;
        System.out.println(naN);
        System.out.println(divideByZero);
        System.out.println(naN == divideByZero);
        boolean isNan = Double.isNaN(divideByZero);
        System.out.println(isNan);
    }
}