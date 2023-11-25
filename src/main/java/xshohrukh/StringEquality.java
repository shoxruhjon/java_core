package xshohrukh;

public class StringEquality {
    public static void main(String[] args) {


       /* int a = 12;
        int b = 12;
        // ==
        if (a == b){
            System.out.println("a and b equal");
        }else{
            System.out.println("a and b not equal");
        }*/

        String name = "JAvOHiR";
        //
        String name2 = "jAVohir";
        // == checks memory address
        /*if (name == name2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }*/
        // name.equals(name2);
        if ( name.equalsIgnoreCase(name2) ) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}