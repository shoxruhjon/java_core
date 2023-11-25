package xshohrukh;

public class DoWhileCS {
    public static void main(String[] args) {
        /*
        System.out.println(1);
        System.out.println(4);
        System.out.println(9);
        System.out.println(16);
        //............
        System.out.println(100);
        */
        int counter = 10000;
        do {
            System.out.println(counter * counter);
            counter++;
        } while ( counter <= 1000 );

    }
}