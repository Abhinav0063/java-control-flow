import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check for spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's in Spring Season");
        } else {
            System.out.println("Not in Spring Season");
        }

        // Close scanner
        input.close();
    }
}
