package xshohrukh;

public class IncrementDecrement {
    public static void main(String[] args) {
        /*
         * Increment Example
         */
        /*
        int counter = 0;
        counter = counter + 1;
        System.out.println(counter);
        counter += 1;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        */
        /*
         * Decrement Example
         */
        /*
        int reverse = 10;
        reverse--;
        System.out.println(reverse);
        reverse--;
        System.out.println(reverse);
        */

        // 10++; invalid syntax
        // postfix n++
        // prefix ++n
        int m = 4;
        int n = 4;
        int a = 8 * ++m;
        int b = 8 * n++;
        System.out.println("n = ");
        System.out.println(n);
        System.out.println("m = ");
        System.out.println(m);
        System.out.println(a);
        System.out.println(b);
    }
}