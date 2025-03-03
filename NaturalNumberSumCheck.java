import java.util.Scanner;

public class NaturalNumberSumCheck {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Verify 
            if (formulaSum == loopSum) {
                System.out.println("Both calculations match. ✅");
            } else {
                System.out.println("There is a mismatch. ❌");
            }
        }

        // Close scanner
        input.close();
    }
}
