import java.util.Scanner;

public class LeapYearMultipleIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Ensure year is in the Gregorian calendar
        if (year < 1582) {
            System.out.println("The program only works for years 1582 and above.");
        } else {
            // Check for leap year conditions using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        input.close();
    }
}
