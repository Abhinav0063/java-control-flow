import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for three numbers
        System.out.print("first number: ");
        int number1 = input.nextInt();
        System.out.print("second number: ");
        int number2 = input.nextInt();
        System.out.print("number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display the output
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close scanner
        input.close();
    }
}
