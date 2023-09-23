package KI305.Fedus.Lab2;

/**
 * This class represents the dimensions of an object.
 */
public class Dimensions {
     private double length;
     private double width;
     private double height;

     /**
      * Default constructor for Dimensions. Initializes dimensions with default values.
      */
     public Dimensions(){
          length = 10;
          width = 100;
          height = 12;
     }

     /**
      * Constructs a Dimensions object with the specified length, width, and height.
      *
      * @param length The length dimension.
      * @param width  The width dimension.
      * @param height The height dimension.
      */
     public Dimensions(double length, double width, double height) {
          this.length = length;
          this.width = width;
          this.height = height;
     }

     /**
      * Get the length dimension.
      *
      * @return The length dimension.
      */
     public double getLength() {
          return length;
     }

     /**
      * Set the length dimension.
      *
      * @param length The length dimension to set.
      */
     public void setLength(double length) {
          this.length = length;
     }

     /**
      * Get the width dimension.
      *
      * @return The width dimension.
      */
     public double getWidth() {
          return width;
     }

     /**
      * Set the width dimension.
      *
      * @param width The width dimension to set.
      */
     public void setWidth(double width) {
          this.width = width;
     }

     /**
      * Get the height dimension.
      *
      * @return The height dimension.
      */
     public double getHeight() {
          return height;
     }

     /**
      * Set the height dimension.
      *
      * @param height The height dimension to set.
      */
     public void setHeight(double height) {
          this.height = height;
     }
}
