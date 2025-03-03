import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        double total = 0.0;  // Initialize total sum

        // Infinite loop that breaks when user enters 0 or negative number
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;  // Stop if input is 0 or negative
            }

            total += num;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close scanner
        input.close();
    }
}
