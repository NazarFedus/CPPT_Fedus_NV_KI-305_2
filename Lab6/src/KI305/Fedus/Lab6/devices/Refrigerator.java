package KI305.Fedus.Lab6.devices;

public class Refrigerator implements DeviceInterface{
    //Data fields
    private Power switchPower = Power.POWER_OFF;
    private Color color = Color.WHITE;
    private double weight = 70.0;
    private double height = 2.0;
    private double width = 0.7;
    private double length = 0.8;

    //Constructors
    public Refrigerator() {
    }

    public Refrigerator(Color color) {
        this.color = color;
    }

    public Refrigerator(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Refrigerator(Color color, double weight, double height, double width, double length) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //Power methods
    @Override
    public void powerOff(){
        if(switchPower == Power.POWER_OFF)
            System.out.println("Smartphone is already powered off.");
        else {
            System.out.println("Smartphone is powered off.");
            switchPower = Power.POWER_OFF;
        }
    }

    @Override
    public void powerOn(){
        if(switchPower == Power.POWER_ON)
            System.out.println("Smartphone is already powered on.");
        else {
            System.out.println("Smartphone is powered on.");
            switchPower = Power.POWER_ON;
        }
    }

    //getter methods
    @Override
    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //toString
    @Override
    public String toString() {
        return String.format("> Color: %s\n> Weight: %s\n> Height: %s\n> Width: %s\n> Length: %s",
                color.toString().toLowerCase(), weight, height, width, length);
    }
}
