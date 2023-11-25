package xshohrukh;

import java.util.Scanner;

public class GuessGame {


    public static void main(String[] args) {
        int number = generateNumber(20, 1);
        System.out.println("Choose number between 1 and 20");
        for ( int i = 0; i < 3; i++ ) {
            int guess = readInputAsInt("Guess number : ");
            if ( guess == number ) {
                System.out.println("You win 😂😂😂 )))");
                return;
            } else {
                System.out.println("Try again ))");
            }
        }
        System.out.println("You loose 😒😒😒");
    }

    private static int readInputAsInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static int generateNumber(int max, int min) {
        if ( max < min ) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) Math.round(Math.random() * ( max - min )) + 1;
    }

}