package xshohrukh;

import java.util.Scanner;

public class IfElseCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = scanner.nextInt();
//        if (age > 50) {
//            System.out.println("Ready For Retirement :(");
//        } else {
//            System.out.println("Work hard :))");
//        }
//        System.out.println("End of program");
        System.out.print("Enter day number : ");
        int dayNumber = scanner.nextInt();

        if ( dayNumber == 1 ) {
            System.out.println("Dushanba");
        } else if ( dayNumber == 2 ) {
            System.out.println("Seshanba");
        } else if ( dayNumber == 3 ) {
            System.out.println("Chorshanba");
        }
        // ..........
        else if ( dayNumber == 7 ) {
            System.out.println("Yakshanba");
        } else {
            System.out.println("Topilmadi");
        }
    }
}