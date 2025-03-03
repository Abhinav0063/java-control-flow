import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Display the output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close scanner
        input.close();
    }
}
