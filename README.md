import java.util.Scanner;

public class Calculator {
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

            if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                System.out.println("Error: Invalid operation.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // consume the newline

            if ((num1 < -1000 || num1 > 1000) || (num2 < -1000 || num2 > 1000)) {
                System.out.println("Error: Input out of range (-1000 to 1000).");
                continue;
            }

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }

            if (validOperation) {
                System.out.printf("The result of %.2f %s %.2f = %.2f%n", num1, operation, num2, result);
            }

            System.out.print("Would you like to perform another operation (yes/no)? ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                keepRunning = false;
                System.out.println("Thank you for using the Java Calculator! Goodbye!");
            }
        }

        scanner.close();
    }
}
