import java.util.Scanner;

public class SuitAndValueOfCard {
    public static String getSuitAndValueOfCard(int suit, int value) {

        String msg1 = "Error";

        if (suit >= 1 && suit <= 4) {
            switch (suit) {
                case 1:
                    msg1 = "spades";
                    break;
                case 2:
                    msg1 = "clubs";
                    break;
                case 3:
                    msg1 = "diamonds";
                    break;
                case 4:
                    msg1 = "hearts";

            }
        }
        String msg2 = "Error";

        if (value >= 6 && value <= 14) {
            switch (value) {
                case 6:
                    msg2 = "six";
                    break;
                case 7:
                    msg2 = "seven";
                    break;
                case 8:
                    msg2 = "eight";
                    break;
                case 9:
                    msg2 = "nine";
                    break;
                case 10:
                    msg2 = "ten";
                    break;
                case 11:
                    msg2 = "Jack";
                    break;
                case 12:
                    msg2 = "Queen";
                    break;
                case 13:
                    msg2 = "King";
                    break;
                case 14:
                    msg2 = "Ace";
                    break;
            }

        }
        return msg1 + " " + msg2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input card suit: ");
        int suit = scanner.nextInt();

        System.out.println("Input card value: ");
        int value = scanner.nextInt();

        System.out.println(getSuitAndValueOfCard(suit, value));

        scanner.close();
    }
}











