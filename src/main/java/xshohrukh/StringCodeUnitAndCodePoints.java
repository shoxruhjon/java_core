package xshohrukh;

public class StringCodeUnitAndCodePoints {
    public static void main(String[] args) {
        String str = "JAVA\u2122\uD83D\uDC96";
        int strLength = str.length(); //code unit
        System.out.println(strLength);
        System.out.println(str);
        // code point
        int codePointAt1 = str.codePointAt(1);
        System.out.println(codePointAt1);
    }
}