import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();

        // Check if the input is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a number between 1 and 99.");
        } else {
            System.out.print("Multiples of " + number + " below 100: ");

            // Start from 100 and go downwards
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--; // Move to the next number
            }
        }
        input.close();
    }
}
