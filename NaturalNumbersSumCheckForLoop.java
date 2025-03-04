import java.util.Scanner;

public class NaturalNumbersSumCheckForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if it's a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Verify correctness
            if (formulaSum == loopSum) {
                System.out.println("Both calculations match. ✅");
            } else {
                System.out.println("There is a mismatch. ❌");
            }
        }

        input.close();
    }
}
