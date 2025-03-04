import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; // Store original number
        int sum = 0; // Initialize sum to store sum of cubes of digits

        // Loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += Math.pow(digit, 3); // Cube the digit and add to sum
            originalNumber /= 10; // Remove last digit
        }

        // Check if Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        input.close();
    }
}
