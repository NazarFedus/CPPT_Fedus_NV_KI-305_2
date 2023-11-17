package KI305.Fedus.Lab5;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The CalculateTheEquation class implements the CalculateTheEquationInterface
 * and provides methods for calculating mathematical equations and handling file I/O.
 */
public class CalculateTheEquation implements CalculateTheEquationInterface, ReadWriteData {
     private double variable = 0;

     /**
      * Calculates the result of the equation 1/sin(x).
      *
      * @param value The input value for the equation.
      * @return The result of the equation 1/sin(x).
      */
     @Override
     public double doCalculation(double value) {
          try {
               return 1 / Math.sin(value);
          } catch (ArithmeticException e) {
               System.out.println("Arithmetic exception: illegal value.");
          }
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
               Scanner inputScanner = new Scanner(System.in);
               System.out.print("Enter value: ");
               double value = inputScanner.nextDouble();
               inputScanner.nextLine();
               variable = 1 / Math.sin(value);
               return variable;
          } catch (ArithmeticException e) {
               System.out.println("Arithmetic exception: illegal value.");
          } catch (InputMismatchException e) {
               System.out.println("Input exception: illegal value.");
          }
          return 0;
     }

     /**
      * Writes the result to a text file.
      *
      * @param fileName The name of the text file.
      * @throws IOException If an I/O error occurs.
      */
     @Override
     public void writeResultToTxt(String fileName) throws IOException {
          PrintWriter writer = new PrintWriter(new FileWriter(fileName));
          writer.printf("%f ", variable);
          writer.close();
     }

     /**
      * Writes the result to a binary file.
      *
      * @param fileName The name of the binary file.
      * @throws IOException If an I/O error occurs.
      */
     @Override
     public void writeResultToBin(String fileName) throws IOException {
          DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
          dos.writeDouble(variable);
          dos.close();
     }

     /**
      * Reads the result from a text file.
      *
      * @param fileName The name of the text file.
      * @throws IOException If an I/O error occurs.
      */
     @Override
     public void readResultFromTxt(String fileName) throws IOException {
          File file = new File(fileName);
          if (file.exists()) {
               try (Scanner scanner = new Scanner(file)) {
                    if (scanner.hasNextDouble()) {
                         variable = scanner.nextDouble();
                    } else {
                         throw new InputMismatchException("Invalid format in file: " + fileName);
                    }
               }
          } else {
               throw new FileNotFoundException("File " + fileName + " not found");
          }
     }

     /**
      * Reads the result from a binary file.
      *
      * @param fileName The name of the binary file.
      * @throws IOException If an I/O error occurs.
      */
     @Override
     public void readResultFromBin(String fileName) throws IOException {
          try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
               variable = dis.readDouble();
          }
     }

     /**
      * Gets the current result value.
      *
      * @return The current result value.
      */
     public double getResult() {
          return variable;
     }
}
