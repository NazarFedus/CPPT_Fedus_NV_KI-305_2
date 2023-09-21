import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class generates and displays a matrix based on user input.
 */
public class Lab1FedusKI305 {

     private static final int MIN_MATRIX_SIZE = 3;

     /**
      * The main method of the program.
      *
      * @param args The command line arguments (not used in this program).
      */
     public static void main(String[] args) {
          // Create a Scanner object to read user input
          Scanner scanner = new Scanner(System.in);

          try {
               // Prompt the user to enter the size of the matrix
               System.out.print("Enter the size of the matrix: ");
               int matrixSize = scanner.nextInt();

               // Validate the matrix size
               while (matrixSize < MIN_MATRIX_SIZE) {
                    System.out.print("Enter the size of the matrix (minimum 3): ");
                    matrixSize = scanner.nextInt();
                    if (matrixSize < MIN_MATRIX_SIZE) {
                         System.out.println("Matrix size must be at least 3.");
                    }
               }

               // Prompt the user to enter the fill character
               System.out.print("Enter the fill character: ");
               String fillInput = scanner.next();

               // Check if the fill character is a single character
               if (fillInput.length() != 1) {
                    throw new IllegalArgumentException("Fill character must be a single character.");
               }

               char fillChar = fillInput.charAt(0);

               // Create a 2D character array to represent the matrix
               char[][] jaggedArray = new char[matrixSize][matrixSize];

               // Fill the matrix with the specified fill character
               for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                         // Fill the edges and diagonals with the fill character
                         if (i == j || i + j == matrixSize - 1 || i == 0 || i == matrixSize - 1) {
                              jaggedArray[i][j] = fillChar;
                         } else {
                              jaggedArray[i][j] = ' ';
                         }
                    }
               }

               // Fill the middle rows of the matrix
               for (int i = 1; i < matrixSize / 2; i++) {
                    for (int j = i; j < matrixSize - i; j++) {
                         jaggedArray[i][j] = fillChar;
                         jaggedArray[matrixSize - 1 - i][j] = fillChar;
                    }
               }

               // Display the matrix
               System.out.println("Generated Matrix:");
               for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                         System.out.print(jaggedArray[i][j]);
                    }
                    System.out.println();
               }

               // Write the matrix to a file
               try (FileWriter writer = new FileWriter("output.txt")) {
                    for (int i = 0; i < matrixSize; i++) {
                         for (int j = 0; j < matrixSize; j++) {
                              writer.write(jaggedArray[i][j]);
                              if (j != matrixSize - 1) {
                                   writer.write(" ");
                              }
                         }
                         writer.write("\n");
                    }
                    System.out.println("Matrix has been written to 'output.txt'.");
               } catch (IOException e) {
                    System.err.println("Error writing to the file: " + e.getMessage());
               }

          } catch (Exception e) {
               System.err.println("Error: " + e.getMessage());
          } finally {
               scanner.close();
          }
     }
}
