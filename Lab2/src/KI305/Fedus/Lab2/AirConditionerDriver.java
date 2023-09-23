package KI305.Fedus.Lab2;

/**
 * This class demonstrates the functionality of an AirConditioner object.
 */
public class AirConditionerDriver {
    public static void main(String[] args) {
        // Creating an air conditioner object
        Dimensions dimensions = new Dimensions(30, 20, 10); // Example dimensions
        Company company = new Company("AC Manufacturer", "London", "0423423"); // Example company
        TemperatureAmplitude temperatureAmplitude = new TemperatureAmplitude(18.0, 25.0, 22.0); // Example temperature amplitude
        AirConditioner myAirConditioner = new AirConditioner("CoolMax", dimensions, company, temperatureAmplitude, 2021, 12000, 1700, "NORMAL");

        // Demonstrating air conditioner properties
        myAirConditioner.displayDetails();

        // Turning on the air conditioner
        myAirConditioner.turnOn();

        // Adjusting temperature
        myAirConditioner.adjustTemperature(20.5);

        // Increasing cooling capacity
        myAirConditioner.increaseCoolingCapacity(2000);

        // Set cooling mode to "ECO"
        myAirConditioner.setCoolingMode("ECO");

        // Increase temperature by 1 degree (should not exceed max temperature for ECO mode)
        myAirConditioner.increaseTemperature();

        // Decrease temperature by 1 degree (should not go below min temperature for ECO mode)
        myAirConditioner.decreaseTemperature();

        // Check if it is on
        myAirConditioner.isOn();

        // Turning off the air conditioner
        myAirConditioner.turnOff();

        // Change fan speed
        myAirConditioner.adjustFanSpeed(1200);

        // Reset air conditioner settings to default
        myAirConditioner.resetSettings();
    }
}
