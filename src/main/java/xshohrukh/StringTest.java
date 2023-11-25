package xshohrukh;

public class StringTest {
    public static void main(String[] args) {
        String name = "Hello world";
        //             0123456789A
        int age = 12;
        // int, short, boolean, long, double, char, float
        String newStr = name.substring(6);
        System.out.println(newStr);
        String newStr2 = name.substring(6, 9);
        // 1-argument -> inclusive
        // 2-argument -> exclusive
        // inclusive ; exclusive .  [2;4)
        System.out.println(newStr2);
        System.out.println(name);

    }
}