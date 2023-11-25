package xshohrukh;

import java.util.Scanner;

public class NestedIfCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your gender (male/female -> 0/1): ");
        int gender = scanner.nextInt();

        System.out.print("Your age : ");
        int age = scanner.nextInt();

        // men -> 60
        // women -> 55

        if ( gender == 0 ) {
            // ...
            if ( age >= 60 ) {
                System.out.println("Enjoy your retirement :( 😊");
            } else {
                int i = 60 - age;
                System.out.println(i + " years for your retirement");
            }
        } else if ( gender == 1 ) {
            if ( age >= 55 ) {
                System.out.println("Enjoy your retirement :( 😊");
            } else {
                int i = 55 - age;
                System.out.println(i + " years for your retirement");
            }
        } else {
            System.out.println("error");
        }

    }
}