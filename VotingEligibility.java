import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close scanner
        input.close();
    }
}
