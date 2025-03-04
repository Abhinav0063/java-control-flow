import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Ask the user for the exponent (power)
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Make sure the power is not negative
        if (power < 0) {
            System.out.println("Power should be a non-negative integer.");
        } else {
            int result = 1; // Start with 1 (since anything raised to 0 is 1)
            int counter = 0; // Initialize counter to track exponentiation steps

            // Multiply the result by the number until counter reaches the power
            while (counter < power) {
                result *= number;
                counter++;
            }

            // Print the final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        input.close();
    }
}
