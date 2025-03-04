import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else {
            boolean isPrime = true; // Assume it's prime initially

            // Check divisibility from 2 to sqrt(number)
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }
        input.close();
    }
}
