// Scanner class to get user input.
import java.util.Scanner;

// Create Calculator class.
public class Calculator {

    // Create the main method
    public static void main(String[] args) {

        // Setting default value for all variables.
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        char operator = 0;
        double num2 = 0;
        double result = 0;

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

        // Input Operator +, -, *, /.
        System.out.println("Enter an Operator");
        operator = input.next().charAt(0);

        // Input second number.
        System.out.println("Enter Second Number");

        // Keeps looping until a number is entered.
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input.");

            // Clear the invalid input.
            input.next();
        }

        // If the loop exits, a valid number has been entered.
        num2 = input.nextDouble();

        // Conditions to check valid operators.
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by 0.");
            }
        } else {
            System.out.println("Invalid Operator.");
        }

        // Prints out the result if all conditions are met.
        System.out.println(result);
        }

    }