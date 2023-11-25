package xshohrukh;

import java.util.Scanner;

public class IfCS {
    public static void main(String[] args) {
        System.out.println("Telegram");
        System.out.println("You will have simple emojis 😊");
        System.out.print("Is your telegram premium (yes/no -> 0/1)");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if ( userInput == 0 ) {
            System.out.println("You will have awesome emojis too");
        }
        System.out.println("...............");
    }
}