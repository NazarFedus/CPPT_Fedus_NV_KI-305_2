package KI305.Fedus.Lab2;

import java.io.FileNotFoundException;

/**
 * ConditionerApp class with the entry point for the program.
 * Author: Fedus N.V. KI-305
 */
public class ConditionerApp {
    /**
     * The main method is the entry point for the program.
     * Creates instances of the Conditioner class, demonstrates its methods, and closes the logger files.
     *
     * @param args command-line arguments (not used in this program)
     * @throws FileNotFoundException if the log file cannot be created.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Create a default Conditioner instance
        Conditioner conditioner = new Conditioner();
        conditioner.getFactoryName(); // Demonstrate getFactoryName method
        conditioner.getConditionColor(); // Demonstrate getConditionColor method

        // Create a custom Conditioner instance with a specific name and color
        Conditioner conditioner1 = new Conditioner("Conditioner 2077", Conditioner.ConditionColor.YELLOW);
        conditioner1.setHighCondition(); // Set the conditioner to high mode
        System.out.println(conditioner1.getConditionMode()); // Print the current mode

        // Close logger files for both instances
        conditioner.closeLoggerFile();
        conditioner1.closeLoggerFile();
    }
}
