package xshohrukh;

public class Methods {
    public static void main(String[] args){
//        System.out.println(faktorial(3));
//        System.out.println(faktorial(4));
//        System.out.println(power(3, 2));
//        System.out.println(power(3, 4));
    }

    static int faktorial(int n){
        if(n == 0 || n == 1)
            return 1;
        return n * faktorial(n - 1);
    }

    static int power(int num, int pow){
        if (pow == 0)
            return 1;
        if (num == 0)
            return 0;
        return num * power(num, pow - 1);
    }

    static int fib(int n){
        if (n <= 1)
            return 1;
        return n + fib(n - 1);
    }
}
