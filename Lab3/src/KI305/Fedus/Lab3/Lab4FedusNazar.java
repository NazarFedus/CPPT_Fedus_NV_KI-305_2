package KI305.Fedus.Lab3;

import java.io.FileNotFoundException;

/**
 * Lab4FedusNazar class demonstrates the usage of the ClimateControlDevice class.
 */
public class Lab4FedusNazar {
    /**
     * The main method for the Lab4FedusNazar class.
     *
     * @param args Command line arguments (not used in this program).
     * @throws FileNotFoundException if an error occurs while handling files.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Create a ClimateControlDevice object with default settings
        ClimateControlDevice climateControlDevice = new ClimateControlDevice();

        // Display the current humidity, temperature, and factory name
        System.out.println("Humidity: " + climateControlDevice.checkHumidity());
        System.out.println("Temperature: " + climateControlDevice.checkTemperature());
        System.out.println("Factory Name: " + climateControlDevice.getFactoryName());

        climateControlDevice.closeLoggerFile();

        // Create another ClimateControlDevice object with custom settings
        ClimateControlDevice climateControlDevice2 = new ClimateControlDevice("Conditioner 3005", Conditioner.ConditionColor.GREEN);

        // Display the temperature, humidity, and factory name for the second device
        System.out.println("Temperature (Device 2): " + climateControlDevice2.checkTemperature());
        System.out.println("Humidity (Device 2): " + climateControlDevice2.checkHumidity());
        System.out.println("Factory Name (Device 2): " + climateControlDevice2.getFactoryName());

        // Close the logger files associated with both devices
        climateControlDevice2.closeLoggerFile();
    }
}
