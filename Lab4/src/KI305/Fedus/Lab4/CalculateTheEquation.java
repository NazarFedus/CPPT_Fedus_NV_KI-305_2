package KI305.Fedus.Lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The CalculateTheEquation class implements the CalculateTheEquationInterface
 * and provides methods for calculating mathematical equations.
 */
public class CalculateTheEquation implements CalculateTheEquationInterface {

    /**
     * Calculates the result of the equation 1/sin(x).
     *
     * @param variable The input value for the equation.
     * @return The result of the equation 1/sin(x).
     */
    @Override
    public double doCalculation(double variable) {
        try {
            // Calculate and return the result
            return 1 / Math.sin(variable);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (e.g., division by zero)
            System.out.println("Arithmetic exception: illegal value.");
        }
        // Return 0 in case of an exception
        return 0;
    }

    /**
     * Takes user input and calculates the result of the equation 1/sin(x).
     *
     * @return The result of the equation 1/sin(x) based on user input.
     */
    @Override
    public double doCalculationWithInputInside() {
        try {
            // Get user input
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();

            // Calculate and return the result
            return 1 / Math.sin(value);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (e.g., division by zero)
            System.out.println("Arithmetic exception: illegal value.");
        } catch (InputMismatchException e) {
            // Handle input mismatch exception (e.g., non-numeric input)
            System.out.println("Input exception: illegal value.");
        }
        // Return 0 in case of an exception
        return 0;
    }
}
