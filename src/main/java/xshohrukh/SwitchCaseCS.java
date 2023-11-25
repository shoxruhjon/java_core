package xshohrukh;

import java.util.Scanner;

public class SwitchCaseCS {
    public static void main(String[] args) {
        // java 7
        Scanner scanner = new Scanner(System.in);
        /*int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("NO idea");
        }*/
        // java 8 String Case, Enum Case
        String day = "Monday";

        /*switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Week day");
                break;
            //....
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("No idea");
        }*/
        // java 12 , ->, java 14
        int number = scanner.nextInt();
        /*switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("NO idea");
        }*/

        String a = switch ( number ) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "NO idea";
        };
        System.out.println(a);
        // java 17 null
    }
}