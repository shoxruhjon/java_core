package xshohrukh;

public class ShiftingOperators {
    public static void main(String[] args) {
//        int x = 4; //00...0000000000001000
//        // 6 -> 110
//        // 7 -> 111
//        // 8 -> 1000
//        int shiftedX = x << 1;
//        int a = 0b1000;
//        System.out.println(shiftedX);
//        System.out.println(a);

//        int x = 4; //000...00000000000010
//        int shiftedX = x >> 1;
//        int a = 0b10;
//        System.out.println(shiftedX);
//        System.out.println(a);
        int x = 12;
        int a = x >> 2;
        int b = x / 4;
//        System.out.println(a);
//        System.out.println(b);
        int shiftedX = x << 1 >> 2 << 3 >> 2 << 2;
        int shiftedXWithNewApproach = ((((x * 2) / 4) * 8) / 4) * 4;
        System.out.println(shiftedX);
        System.out.println(shiftedXWithNewApproach);
        int twoToThePower10 = 1 << 5;
        System.out.println(twoToThePower10);
    }
}