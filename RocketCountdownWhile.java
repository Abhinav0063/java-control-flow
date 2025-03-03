import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for countdown
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Countdown with while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement
        }

        System.out.println("Liftoff! 🚀");

        // Close scanner
        input.close();
    }
}
