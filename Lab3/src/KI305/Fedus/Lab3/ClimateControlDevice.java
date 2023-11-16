package KI305.Fedus.Lab3;

import java.io.FileNotFoundException;

/**
 * The TemperatureControlDeviceInterface provides an interface for devices
 * capable of checking and controlling temperature.
 */
interface TemperatureControlDeviceInterface {
     /**
      * Checks the temperature level.
      *
      * @return the current temperature level.
      */
     double checkTemperature();
}

/**
 * The HumidityControlDeviceInterface provides an interface for devices
 * capable of checking and controlling humidity.
 */
interface HumidityControlDeviceInterface {
     /**
      * Checks the humidity level.
      *
      * @return the current humidity level.
      */
     double checkHumidity();
}

/**
 * The ClimateControlDevice class represents a climate control device
 * extending the Conditioner class. It implements temperature and humidity
 * control interfaces and introduces a charge field for power management.
 */
public class ClimateControlDevice extends Conditioner
          implements TemperatureControlDeviceInterface, HumidityControlDeviceInterface {
     private double charge; // Reusing the charge field from Conditioner
     private static int controllerNumber = 1;

     /**
      * Default constructor for the ClimateControlDevice class.
      * Initializes the climate control device with a generated factory name
      * and a full charge. Increments the controller number.
      *
      * @throws FileNotFoundException if the log file cannot be created.
      */
     public ClimateControlDevice() throws FileNotFoundException {
          super(String.format("#%s ClimateControlDevice", controllerNumber));
          this.charge = 100.0;
          ++controllerNumber;
     }

     /**
      * Constructor for the ClimateControlDevice class with a custom factory name.
      * Initializes the climate control device with the specified factory name
      * and a full charge. Increments the controller number.
      *
      * @param factoryName the custom factory name for the climate control device.
      * @throws FileNotFoundException if the log file cannot be created.
      */
     public ClimateControlDevice(String factoryName) throws FileNotFoundException {
          super(factoryName);
          this.charge = 100.0;
          ++controllerNumber;
     }

     /**
      * Constructor for the ClimateControlDevice class with a custom factory name and
      * condition color.
      * Initializes the climate control device with the specified factory name,
      * condition color,
      * and a full charge. Increments the controller number.
      *
      * @param factoryName    the custom factory name for the climate control device.
      * @param conditionColor the color of the climate control device.
      * @throws FileNotFoundException if the log file cannot be created.
      */
     public ClimateControlDevice(String factoryName, Conditioner.ConditionColor conditionColor)
               throws FileNotFoundException {
          super(factoryName, conditionColor);
          this.charge = 100.0;
          ++controllerNumber;
     }

     /**
      * Checks the humidity level, simulating a decrease in charge.
      *
      * @return a random humidity level within the range [-50, 50].
      */
     @Override
     public double checkHumidity() {
          if (charge - 0.2 < 0) {
               System.out.println("Device is discharged.");
               return 0;
          }
          charge -= 0.2;

          if (outputStream == null) {
               try {
                   openOutputStream();
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }
           }
          double humidityValue = (Math.random() * (50 + 50)) - 50;
          outputStream.println("checkHumidity: " + humidityValue);
          return humidityValue;
     }

     /**
      * Checks the temperature level, simulating a decrease in charge.
      *
      * @return a random temperature level within the range [0, 100].
      */
     @Override
     public double checkTemperature() {
          if (charge - 0.2 < 0) {
               System.out.println("Device is discharged.");
               return 0;
          }
          charge -= 0.2;
          
          if (outputStream == null) {
               try {
                   openOutputStream();
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }
           }
          double temperatureValue = Math.random() * 100;
          outputStream.println("checkTemperature: " + temperatureValue);
          return temperatureValue;
     }

     /**
      * Charges the climate control device by a small amount if not fully charged.
      */
     public void toCharge() {
          if (charge == 100.0)
               System.out.println("Is already charged.");
          else
               charge += 0.1;
     }
}
