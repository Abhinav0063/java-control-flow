import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for countdown
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Liftoff! 🚀");

        // Close scanner
        input.close();
    }
}
