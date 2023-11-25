package xshohrukh;

public class BitwiseOperators {
    public static void main(String[] args) {
        // bitwise or
        // 2 -> 10
        // 3 -> 11
        // 4 -> 100
        // 5 -> 101
        // 6 -> 110
        int x = 4; // 100
        int y = 2; // 10
        // 4 | 2
        // 100
        // 010
        // 110
        // 4 | 4
        // 100
        // 100
        // 100
        System.out.println(x | y);
        // bitwise and
        // 4 | 2
        // 100
        // 010
        // 000
        System.out.println(x & y);
        // bitwise xor
        // 4 | 2
        // 100
        // 010
        // 110
        System.out.println(x ^ y);
        // bitwise complement
        System.out.println(~y);
    }
}