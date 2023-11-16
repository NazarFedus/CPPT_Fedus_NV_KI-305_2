package KI305.Fedus.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * The abstract class Conditioner represents a basic air conditioner.
 * It provides functionality for managing the state of the conditioner
 * and logging information to a file.
 */
public abstract class Conditioner {
    private String factoryName; // Factory name of the conditioner
    private ConditionColor conditionColor; // Color of the conditioner
    private ConditionMode conditionMode; // Mode of the conditioner
    private static int conditionerNumber = 1; // Static counter for generating unique conditioner numbers
    protected PrintWriter outputStream; // PrintWriter for logging information to a file

    /**
     * Default constructor for the Conditioner class.
     * Initializes the conditioner with default values and increments the conditioner number.
     */
    public Conditioner() {
        factoryName = String.format("#%s Conditioner", conditionerNumber);
        conditionColor = ConditionColor.WHITE;
        conditionMode = ConditionMode.TURNED_OFF;
        conditionerNumber++;
    }

    /**
     * Constructor for the Conditioner class with a custom factory name.
     * Initializes the conditioner with the specified factory name and default values.
     * @param factoryName the custom factory name for the conditioner.
     */
    public Conditioner(String factoryName) {
        this.factoryName = factoryName;
        conditionColor = ConditionColor.WHITE;
        conditionMode = ConditionMode.TURNED_OFF;
        conditionerNumber++;
    }

    /**
     * Constructor for the Conditioner class with a custom factory name and condition color.
     * Initializes the conditioner with the specified factory name, condition color, and default mode.
     * @param factoryName the custom factory name for the conditioner.
     * @param conditionColor the color of the conditioner.
     */
    public Conditioner(String factoryName, ConditionColor conditionColor) {
        this.factoryName = factoryName;
        this.conditionColor = conditionColor;
        conditionMode = ConditionMode.TURNED_OFF;
        conditionerNumber++;
    }

    /**
     * Opens the output stream for logging if not already opened.
     * @throws FileNotFoundException if the log file cannot be created.
     */
    protected void openOutputStream() throws FileNotFoundException {
        outputStream = new PrintWriter(new File(String.format("ConditionerLogger%s.txt", conditionerNumber)));
        outputStream.println("Creating a conditioner");
    }

    /**
     * Get the factory name of the conditioner.
     * @return the factory name of the conditioner.
     */
    public String getFactoryName() {
        if (outputStream == null) {
            try {
                openOutputStream();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        outputStream.println("getFactoryName: " + factoryName);
        return factoryName;
    }

    /**
     * Get the current mode of the conditioner.
     * @return the current mode of the conditioner.
     */
    public ConditionMode getConditionMode() {
        if (outputStream == null) {
            try {
                openOutputStream();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        outputStream.println("getConditionMode: " + conditionMode);
        return conditionMode;
    }

    /**
     * Get the color of the conditioner.
     * @return the color of the conditioner.
     */
    public ConditionColor getConditionColor() {
        if (outputStream == null) {
            try {
                openOutputStream();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        outputStream.println("getConditionColor: " + conditionColor);
        return conditionColor;
    }

    /**
     * Closes the logger file associated with the conditioner.
     */
    public void closeLoggerFile() {
        if (outputStream != null) {
            outputStream.println("Close logger file.");
            outputStream.close();
        }
    }

    /**
     * Turn off the conditioner if it is not already turned off.
     */
    public void turnOffCondition() {
        if (conditionMode == ConditionMode.TURNED_OFF) {
            System.out.println("Condition is already turned off.");
            outputStream.println("Condition is already turned off.");
        } else {
            System.out.println("Condition is turned off.");
            outputStream.println("Condition is turned off.");
            conditionMode = ConditionMode.TURNED_OFF;
        }
    }

    /**
     * Set the conditioner to low mode if it is not already in low mode.
     */
    public void setLowCondition() {
        if (conditionMode == ConditionMode.LOW) {
            System.out.println("Condition is already in low mode.");
            outputStream.println("Condition is already in low mode.");
        } else {
            System.out.println("Condition is set in low mode.");
            outputStream.println("Condition is set in low mode.");
            conditionMode = ConditionMode.LOW;
        }
    }

    /**
     * Set the conditioner to medium mode if it is not already in medium mode.
     */
    public void setMediumCondition() {
        if (conditionMode == ConditionMode.MEDIUM) {
            System.out.println("Condition is already in medium mode.");
            outputStream.println("Condition is already in medium mode.");
        } else {
            System.out.println("Condition is set in medium mode.");
            outputStream.println("Condition is set in medium mode.");
            conditionMode = ConditionMode.MEDIUM;
        }
    }

    /**
     * Set the conditioner to high mode if it is not already in high mode.
     */
    public void setHighCondition() {
        if (conditionMode == ConditionMode.HIGH) {
            System.out.println("Condition is already in high mode.");
            outputStream.println("Condition is already in high mode.");
        } else {
            System.out.println("Condition is set in high mode.");
            outputStream.println("Condition is set in high mode.");
            conditionMode = ConditionMode.HIGH;
        }
    }

    /**
     * Enum representing different modes of the conditioner.
     */
    private enum ConditionMode {
        TURNED_OFF, LOW, MEDIUM, HIGH
    }

    /**
     * Enum representing different colors of the conditioner.
     */
    public enum ConditionColor {
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }
}
