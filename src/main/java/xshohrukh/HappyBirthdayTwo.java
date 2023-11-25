package xshohrukh;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HappyBirthdayTwo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.nextLine();


        for ( int i = 0; i < 300; i++ ) {
            TimeUnit.MILLISECONDS.sleep(200); //

            int leftSideDotesCount = randomNumberBetween1And30();
            int rightSideDotesCount = 30 - leftSideDotesCount;

            String leftSide = getSide(leftSideDotesCount);
            String rightSide = getSide(rightSideDotesCount);
            String message = leftSide + "Happy birthday " + name + rightSide;
            System.out.println(message);
        }

    }

    static String getSide(int repeatCount) {
        String birthdayCake = "\uD83C\uDF82";
        String wrappedPresent = "\uD83C\uDF81";
        String confettiBall = "\uD83C\uDF8A";
        String beatingHeartEmoji = "\uD83D\uDC93";
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i = 0; i < repeatCount; i++ ) {
            int randNumber = randomNumberBetween1And4();
            String sign = switch ( randNumber ) {
                case 1 -> birthdayCake;
                case 2 -> wrappedPresent;
                case 3 -> confettiBall;
                case 4 -> beatingHeartEmoji;
                default -> birthdayCake;
            };
            stringBuilder.append(sign);
        }

        return stringBuilder.toString();
    }

    static int randomNumberBetween1And30() {
        return (int) Math.round(Math.random() * ( 30 - 1 )) + 1;
    }

    static int randomNumberBetween1And4() {
        return (int) Math.round(Math.random() * ( 4 - 1 )) + 1;
    }

}