import java.util.Scanner;

public class AmountDaysInMonth {
    public static int defineAmountDays(int month, int year) {

        int amountDays = 0;
        if (month >= 1 && month <= 12) {
            if (year >= 1900 && year <= 3000) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        amountDays = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        amountDays = 30;
                        break;
                    case 2:
                        if (year % 4 == 0) {
                            amountDays = 29;
                        } else {
                            amountDays = 28;
                        }
                }
            }
        }
        return amountDays;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input month ");
        int month = scanner.nextInt();

        System.out.println("Please, input years ");
        int year = scanner.nextInt();

        int amountDays = (AmountDaysInMonth.defineAmountDays(month, year));
        System.out.println("Amount days in month is " + amountDays);

    }
}






