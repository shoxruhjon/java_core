package xshohrukh;

public class Fibonacci {
    public static void main(String[] args) {
        // f(n) = f(n - 1) + f(n - 2)
        // f(0) = 0
        // f(1) = 1
        // f(2) = f(1) + f(0) = 1
        // f(3) = f(2) + f(1) = 2
        // f(4) = f(3) + f(2) = 3
        // f(5) = f(4) + f(3) = 5
        // f(6) = f(5) + f(4) = 8
//        int fibonacci3 = fibonacci(3);
//        int fibonacci6 = fibonacci(6);
//        int fibonacci13 = fibonacci(13);
//        System.out.println(fibonacci3);
//        System.out.println(fibonacci6);
//        System.out.println(fibonacci13);
        long fibonacci100 = fibonacci2(100);
        System.out.println(fibonacci100);
//        hello();
    }

    static void hello() {
        System.out.println("Hello");
        hello();
    }


    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static long fibonacci2(int n) {
        long f0 = 0;
        long f1 = 1;
        for (int i = 2; i <= n; i++) {
            long temp = f1;
            f1 = f1 + f0;
            f0 = temp;
        }
        return f1;
    }
}