/**
 * Calculator app
 *
 * @author Etienne Lafond
 * @version 1.0
 * @since 2022-06-08
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variables
        double value1;
        double value2;
        double result = 0;
        String operation;

        // Do stuff
        value1 = in.nextDouble();
        operation = in.next();

        // Check if the operation "equal" after the first value
        if (operation.equals("equal")) {
            result = value1;
        }

        // Keep taking input until it receives the operation "equal"
        while (!operation.equals("equal")) {
            // Get second input
            value2 = in.nextDouble();

            // Chooses the right method for the selected operation
            switch (operation) {
                case "add" -> result = addition(value1, value2);
                case "sub" -> result = subtraction(value1, value2);
                case "mul" -> result = multiplication(value1, value2);
                case "div" -> result = division(value1, value2);
                case "mod" -> result = modulo(value1, value2);
            }

            value1 = result;
            operation = in.next();
        }
        // Print result
        System.out.println(result);
    }

    // Addition
    public static double addition(double value1, double value2) {
        return value1 + value2;
    }

    // Subtraction
    public static double subtraction(double value1, double value2) {
        return value1 - value2;
    }

    // Multiplication
    public static double multiplication(double value1, double value2) {
        return value1 * value2;
    }

    // Division
    public static double division(double value1, double value2) {
        return value1 / value2;
    }

    // Modulo
    public static double modulo(double value1, double value2) {
        return value1 % value2;
    }
}
