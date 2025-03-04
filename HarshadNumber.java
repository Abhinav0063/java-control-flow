import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; // Store original number
        int sum = 0; // Variable to store sum of digits

        // Find sum of digits
        while (number > 0) {
            sum += number % 10; // Get last digit and add to sum
            number /= 10; // Remove last digit
        }

        // Check if the original number is divisible by sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}
