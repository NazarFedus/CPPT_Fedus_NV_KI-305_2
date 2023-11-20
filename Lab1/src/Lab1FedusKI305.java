import java.io.*;
import java.util.*;

/**
 * The Lab1FedusKI305 class implements Laboratory Work #1.
 *
 * This program creates a square matrix based on user input for its size and a symbol.
 * It then populates the matrix with the symbol in a specific pattern and prints the result.
 *
 * @author Fedus Nazar
 * @version 1.0
 * @since version 1.0
 */
public class Lab1FedusKI305 {

    /**
     * The main method is the entry point of the program.
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        File dataFile = new File("output.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the matrix: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[nRows];
        }

        System.out.print("Enter the fill character: ");
        filler = in.nextLine();
        int temp = 0;
        exit:
        for (int i = 0; i < nRows / 2; i++) {
            for (int j = 0; j < nRows - temp; j++) {
                if (filler.length() == 1) {
                    if (j >= temp) {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print("  ");
                        fout.print("  ");
                    }
                } else if (filler.length() == 0) {
                    System.out.print("\nNo symbol entered");
                    break exit;
                } else {
                    System.out.print("\nToo many symbols");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
            temp++;
        }
        temp = nRows / 2;
        exit1:
        for (int i = temp; i < nRows; i++) {
            for (int j = 0; j < nRows - temp; j++) {
                if (filler.length() == 1) {
                    if (j >= temp) {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print("  ");
                        fout.print("  ");
                    }
                } else if (filler.length() == 0) {
                    System.out.print("\nNo symbol entered");
                    break exit1;
                } else {
                    System.out.print("\nToo many symbols");
                    break exit1;
                }
            }
            System.out.print("\n");
            fout.print("\n");
            temp--;
        }
        fout.flush();
        fout.close();
    }
}
