// Scanner class to get user input.
import java.util.Scanner;

// Create Calculator class.
public class Calculator {

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    // The main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input First Number.
        System.out.println("Enter First Number");

        // Keeps looping until a number is entered.
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input.");

            // Clear the invalid input
            input.next();
        }
        // If the loop exits, a valid number has been entered.
        num1 = input.nextDouble();

        // Input second number.
        System.out.println("Enter Second Number");

        // Keeps looping until a number is entered.
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input.");

            // Clear the invalid input.
            input.next();
        }
        // If the loop exits, a valid number has been entered
        num2 = input.nextDouble();

        // Perform addition
        double sum = add(num1, num2);
        System.out.println(sum);

        // Perform subtraction
        double difference = subtract(num1, num2);
        System.out.println(difference);

        // Perform multiplication
        double product = multiply(num1, num2);
        System.out.println(product);

        // Perform division
        try {
            double division = divide(num1, num2);
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
