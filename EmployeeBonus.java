import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for salary and years of service
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is INR " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years of service.");
        }

        input.close();
    }
}
