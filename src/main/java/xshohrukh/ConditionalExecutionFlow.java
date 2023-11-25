package xshohrukh;

import java.util.Scanner;

public class ConditionalExecutionFlow {

    public static void main(String[] args) {
        System.out.println("How many legs will horses have ? ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if ( userInput == 4 ) {
            System.out.println("Yes, You Right :) 😊");
        } else {
            System.out.println("Nope :( 😒");
        }
    }
}