import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0; // Initialize digit count

        // If number is 0, count is 1 (special case)
        if (number == 0) {
            count = 1;
        } else {
            // Count digits using loop
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increment count
            }
        }

        System.out.println("Number of digits: " + count);
        input.close();
    }
}
