package xshohrukh;

public class LabelledLoop {
    public static void main(String[] args) {
        pdp:
        for ( int i = 0; i < 10; i++ ) {

            for ( int j = 0; j < 10; j++ ) {
                if ( j == 4 ) {
                    //break pdp;
                    continue pdp;
                }
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
    }
}