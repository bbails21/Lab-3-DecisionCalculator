import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        boolean keepRunning = true;

        System.out.println("Welcome to the Java Calculator!");

        while (keepRunning) {
            System.out.print("Enter an operation (+, -, *, /, or exit): ");
            operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                keepRunning = false;
                System.out.println("Thank you for using the Java Calculator! Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // consume leftover newline

            switch (operation) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, /, or exit.");
            }
        }

        scanner.close();
    }
}