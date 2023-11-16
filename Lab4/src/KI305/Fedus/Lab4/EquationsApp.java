package KI305.Fedus.Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * The EquationsApp class contains the main method to demonstrate and write
 * the results of mathematical equations to a file.
 */
public class EquationsApp {

    /**
     * The main method where the program execution begins.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an instance of CalculateTheEquationInterface
        CalculateTheEquationInterface calc = new CalculateTheEquation();

        // File path where you want to save the results
        String filePath = "equation_results.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Perform calculations and write results to the file
            writer.println(" y=1/sin(x) = " + calc.doCalculation(100));
            writer.println(" y=1/sin(x) = " + calc.doCalculation(90));
            writer.println(" y=1/sin(x) = " + calc.doCalculation(-1111));

            // Input from the user and write the result to the file
            double userInputResult = calc.doCalculationWithInputInside();
            writer.println("Result with our entered number:");
            writer.println(" y=1/sin(x) = " + userInputResult);
            System.out.println("Result written to file: " + filePath);
        } catch (IOException e) {
            // Handle IOException (e.g., if there's an issue writing to the file)
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
