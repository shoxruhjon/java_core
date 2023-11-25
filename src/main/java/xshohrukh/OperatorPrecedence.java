package xshohrukh;

public class OperatorPrecedence {

    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 11;
        a += b += c;
        // right to left (a += (b += c))
        // c=11;
        // b=20;
        // a=24
//        System.out.println(a);
//        System.out.println(b);
        int x = 12;
        int y = 5;
        int z = x+(++y); // x++ yoki ++y
        System.out.println(z);
        System.out.println("Java\u2122");
        System.out.println("Java ");
        System.out.println("Java \u1613");
        System.out.println("Java \u1f480");
        System.out.println("Java \u0041");
        System.out.println("Java \u6771");
        char[] chars = Character.toChars(0x10400);
        System.out.println(new String(chars));
    }
}