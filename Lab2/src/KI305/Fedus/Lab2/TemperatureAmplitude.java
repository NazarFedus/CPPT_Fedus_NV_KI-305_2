package KI305.Fedus.Lab2;

/**
 * This class represents the temperature amplitude, including minimum, maximum, and current temperatures.
 */
public class TemperatureAmplitude {
     private double minTemperature;
     private double maxTemperature;
     private double currentTemperature;

     /**
      * Default constructor for TemperatureAmplitude. Initializes temperature limits and current temperature with default values.
      */
     public TemperatureAmplitude() {
          minTemperature = 0.0;        // Default minimum temperature
          maxTemperature = 100.0;      // Default maximum temperature
          currentTemperature = 25.0;   // Default current temperature
     }

     /**
      * Constructs a TemperatureAmplitude object with the specified minimum, maximum, and current temperatures.
      *
      * @param minTemperature The minimum temperature limit.
      * @param maxTemperature The maximum temperature limit.
      * @param currentTemperature The current temperature.
      */
     public TemperatureAmplitude(double minTemperature, double maxTemperature, double currentTemperature) {
          this.minTemperature = minTemperature;
          this.maxTemperature = maxTemperature;
          this.currentTemperature = currentTemperature;
     }

     /**
      * Get the minimum temperature limit.
      *
      * @return The minimum temperature limit.
      */
     public double getMinTemperature() {
          return minTemperature;
     }

     /**
      * Set the minimum temperature limit.
      *
      * @param minTemperature The minimum temperature limit to set.
      */
     public void setMinTemperature(double minTemperature) {
          this.minTemperature = minTemperature;
     }

     /**
      * Get the maximum temperature limit.
      *
      * @return The maximum temperature limit.
      */
     public double getMaxTemperature() {
          return maxTemperature;
     }

     /**
      * Set the maximum temperature limit.
      *
      * @param maxTemperature The maximum temperature limit to set.
      */
     public void setMaxTemperature(double maxTemperature) {
          this.maxTemperature = maxTemperature;
     }

     /**
      * Get the current temperature.
      *
      * @return The current temperature.
      */
     public double getCurrentTemperature() {
          return currentTemperature;
     }

     /**
      * Set the current temperature.
      *
      * @param currentTemperature The current temperature to set.
      */
     public void setCurrentTemperature(double currentTemperature) {
          this.currentTemperature = currentTemperature;
     }
}
