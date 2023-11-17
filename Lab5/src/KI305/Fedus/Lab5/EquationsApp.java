package KI305.Fedus.Lab5;

import java.io.IOException;

/**
 * The EquationsApp class provides a main method to test the functionality of the CalculateTheEquation class.
 */
public class EquationsApp {
    public static void main(String[] args) {
        // Create an instance of the CalculateTheEquation class
        CalculateTheEquation calc = new CalculateTheEquation();

        try {
            // Input from user and calculate the result
            double userInputResult = calc.doCalculationWithInputInside();
            System.out.println("Result of calculation: " + userInputResult);

            // Write the result to text file
            calc.writeResultToTxt("Lab5/src/KI305/Fedus/Lab5/data.txt");

            // Write the result to binary file
            calc.writeResultToBin("Lab5/src/KI305/Fedus/Lab5/data.bin");

            // Read the result from text file
            calc.readResultFromTxt("Lab5/src/KI305/Fedus/Lab5/data.txt");
            System.out.println("Result read from text file: " + calc.getResult());

            // Read the result from binary file
            calc.readResultFromBin("Lab5/src/KI305/Fedus/Lab5/data.bin");
            System.out.println("Result read from binary file: " + calc.getResult());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
