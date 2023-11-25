package xshohrukh;

public class MathFunctions {

    public static void main(String[] args) {
        /*
        int abs = Math.abs(-100);
        System.out.println(abs);
        int x = 90;
        int y = 101;
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        System.out.println(max);
        System.out.println(min);

        double a = 12.1;
        double aCeil = Math.ceil(a);
        System.out.println(aCeil);

        double b = 12.9;
        double bFloor = Math.floor(b);
        System.out.println(bFloor);

        double c  = 12.4;
        long cRound = Math.round(c);
        System.out.println(cRound);

        double d = 12.5;
        long dRound = Math.round(d);
        System.out.println(dRound);
        */
        double random = Math.random();
        //System.out.println(random);
        int a = 10;
        int b = 20;
        // 0.0 <= random < 0.9(9)
        /* random 0.0 =>
                random * b = 0
                result = 0 + a
           random 0.999999999 =>
                random * b > 19.5 + a;
        random = 0.9999
        random * (b - a) + a;
        */
        double result = random * ( b - a ) + a;
        System.out.println(result);
        long roundedResult = Math.round(result);
        System.out.println(roundedResult);
        System.out.println(Math.E);
        System.out.println(Math.PI);
    }
}