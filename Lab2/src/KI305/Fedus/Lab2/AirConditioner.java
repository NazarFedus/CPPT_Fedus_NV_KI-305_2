package KI305.Fedus.Lab2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This class represents an Air Conditioner.
 */
public class AirConditioner {

     private String model;
     private Dimensions dimensions;
     private Company company;
     private TemperatureAmplitude temperature_amplitude;
     private int year_of_release;
     private int coolingCapacity;
     private boolean isOn;
     private int fanSpeed;
     private String coolingMode;

     /**
      * Default constructor for AirConditioner.
      */
     public AirConditioner() {
          model = "Unknown";
          dimensions = new Dimensions();
          company = new Company();
          temperature_amplitude = new TemperatureAmplitude();
          year_of_release = 2022;
          coolingCapacity = 10000;
          this.isOn = false;
          fanSpeed = 1000;
          coolingMode = "NORMAL"; // Default cooling mode
     }

     public AirConditioner(String model, Dimensions dimensions, Company company,
               TemperatureAmplitude temperature_amplitude,
               int year_of_release, int coolingCapacity, int fanSpeed, String coolingMode) {
          this.model = model;
          this.dimensions = dimensions;
          this.company = company;
          this.temperature_amplitude = temperature_amplitude;
          this.year_of_release = year_of_release;
          this.coolingCapacity = coolingCapacity;
          this.isOn = false;
          this.fanSpeed = fanSpeed;
          setCoolingMode(coolingMode); // Set cooling mode using the method to apply restrictions
     }

     public String getModel() {
          return model;
     }

     public Dimensions getDimensions() {
          return dimensions;
     }

     public Company getCompany() {
          return company;
     }

     public TemperatureAmplitude getTemperatureAmplitude() {
          return temperature_amplitude;
     }

     public int getYearOfRelease() {
          return year_of_release;
     }

     public int getCoolingCapacity() {
          return coolingCapacity;
     }

     /**
      * Turns on the air conditioner.
      */
     public void turnOn() {
          isOn = true;
          logActivity("Air conditioner turned ON.");
     }

     /**
      * Turns off the air conditioner.
      */
     public void turnOff() {
          isOn = false;
          logActivity("Air conditioner turned OFF.");
     }

     /**
      * Checks if the air conditioner is on.
      *
      * @return true if the air conditioner is on, false otherwise
      */
     public boolean isOn() {
          logActivity("Checking if the air conditioner is on. It is " + (isOn ? "ON" : "OFF") + ".");
          return isOn;
     }

     /**
      * Adjusts the temperature of the air conditioner.
      *
      * @param newTemperature the new temperature to set
      */
     public void adjustTemperature(double newTemperature) {
          temperature_amplitude.setCurrentTemperature(newTemperature);
          logActivity("Temperature adjusted to " + newTemperature + " degrees Celsius.");
     }

     /**
      * Increases the temperature by 1 degree Celsius, considering the temperature
      * limits
      */
     public void increaseTemperature() {
          double newTemperature = temperature_amplitude.getCurrentTemperature() + 1.0;
          if (newTemperature < temperature_amplitude.getMaxTemperature()) {
               temperature_amplitude.setCurrentTemperature(newTemperature);
               logActivity("Temperature increased to " + newTemperature + " degrees Celsius.");
          } else {
               logActivity(
                         "Temperature cannot be increased beyond the temperature limits ");
          }
     }

     /**
      * Decreases the temperature by 1 degree Celsius, considering the temperature
      * limits
      */
     public void decreaseTemperature() {
          double newTemperature = temperature_amplitude.getCurrentTemperature() - 1.0;
          if (newTemperature > temperature_amplitude.getMinTemperature()) {
               temperature_amplitude.setCurrentTemperature(newTemperature);
               logActivity("Temperature decreased to " + newTemperature + " degrees Celsius.");
          } else {
               logActivity(
                         "Temperature cannot be decreased beyond the temperature limits");
          }
     }

     /**
      * Increases the cooling capacity of the air conditioner.
      *
      * @param additionalCapacity the additional capacity to add
      */
     public void increaseCoolingCapacity(int additionalCapacity) {
          coolingCapacity += additionalCapacity;
          logActivity("Cooling capacity increased by " + additionalCapacity + " BTU.");
     }

     /**
      * Set the fan speed of the air conditioner.
      *
      * @param speed the fan speed to set
      */
     public void adjustFanSpeed(int speed) {
          fanSpeed = Math.min(speed, 1000); // Limit fan speed to 1000
          logActivity("Fan speed set to " + fanSpeed + ".");
     }

     /**
      * Set the cooling mode of the air conditioner.
      *
      * @param mode the cooling mode to set (ECO, NORMAL, FAST)
      */
     public void setCoolingMode(String mode) {
          if ("ECO".equals(mode)) {
               fanSpeed = 500; // Adjust fan speed for ECO mode
          } else if ("FAST".equals(mode)) {
               fanSpeed = 1500; // Adjust fan speed for FAST mode
          } else {
               fanSpeed = 1000; // Default fan speed for NORMAL mode
          }
          coolingMode = mode;
          logActivity("Cooling mode set to " + mode + ".");
     }

     /**
      * Resets the air conditioner settings to default values.
      */
     public void resetSettings() {
          temperature_amplitude.setCurrentTemperature(25.0);
          coolingCapacity = 10000;
          fanSpeed = 1000;
          coolingMode = "NORMAL";
          logActivity("Air conditioner settings reset to default.");
     }

     /**
      * Displays the details of the air conditioner.
      */
     public void displayDetails() {
          System.out.println("Air Conditioner Details:");
          System.out.println("Model: " + model);
          System.out.println("Dimensions: " + dimensions.toString());
          System.out.println("Company: " + company.getName());
          System.out.println("Year of Release: " + year_of_release);
          System.out.println("Cooling Capacity: " + coolingCapacity + " BTU");
          System.out.println(
                    "Current Temperature: " + temperature_amplitude.getCurrentTemperature() + " degrees Celsius");
          System.out.println("Is On: " + (isOn ? "Yes" : "No"));
          System.out.println("Fan Speed: " + fanSpeed + " RPM");
          System.out.println("Cooling Mode: " + coolingMode);

          logActivity("Checking the condition of the air conditioner");
     }

     /**
      * Logs activity to a file.
      *
      * @param logMessage the message to log
      */
     public void logActivity(String logMessage) {
          try (FileWriter writer = new FileWriter("activity.log", true)) {
               writer.write(logMessage + "\n");
          } catch (IOException e) {
               System.err.println("Error writing to the log file: " + e.getMessage());
          }
     }
}
