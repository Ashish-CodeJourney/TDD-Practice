package calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit the program");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.exit(0); // Ensure the program exits
    }
}
