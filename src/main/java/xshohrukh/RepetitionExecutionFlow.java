package xshohrukh;

import java.util.Scanner;

public class RepetitionExecutionFlow {
    public static void main(String[] args) {

        int userInput;
        do {
            System.out.print("How many legs will horses have ? ");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();
            if ( userInput == 4 ) {
                System.out.println("Yes, You Right :) 😊");
            } else {
                System.out.println("Nope :( 😒");
                System.out.println("Try again 🙌");
            }
        } while ( userInput != 4 );
    }
}