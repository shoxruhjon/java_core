package xshohrukh;

public class Recursion {
    public static void main(String[] args) {
        // recursion(5);
        // headRecursion(3);
        treeRecursion(3);
    }

    static void recursion(int n) { // tail recursion
        if ( n > 0 ) { // 1) base condition
            System.out.println(n);
            n = n - 1; // 3) change state
            recursion(n); // 2) call
        }
    }

    static void headRecursion(int n) {
        if ( n > 0 ) {
            headRecursion(n - 1);
            System.out.println(n);
        }
    }

    static void treeRecursion(int n) {
        if ( n > 0 ) {
            System.out.println(n);
            treeRecursion(n - 1);
            treeRecursion(n - 1);
        }
    }
}