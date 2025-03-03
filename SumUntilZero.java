import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        double total = 0.0;  // Initialize total sum

        // Loop to get input until user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = input.nextDouble();

            if (num == 0) {
                break;  // Stop the loop if the input is 0
            }

            total += num;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close scanner
        input.close();
    }
}
