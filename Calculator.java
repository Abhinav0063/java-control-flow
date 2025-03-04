import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for numbers and operator
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        double result;

        // Perform operation using switch-case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator! Please enter +, -, *, or /.");
        }

        input.close();
    }
}
