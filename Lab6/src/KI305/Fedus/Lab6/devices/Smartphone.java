package KI305.Fedus.Lab6.devices;

public class Smartphone implements DeviceInterface{
    //Data fields
    private Power switchPower = Power.POWER_OFF;
    private Color color = Color.WHITE;
    private double charge = 100.0;

    //Constructors
    public Smartphone() {
    }

    public Smartphone(Color color) {
        this.color = color;
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

    public double getCharge() {
        return charge;
    }

    //to charge
    public void toCharge(){
        if(charge == 100.0)
            System.out.println("Is already charged.");
        else
            charge += 0.1;
    }

    //work
    public void doSomeWork(){
        if(charge <= 20)
            System.out.println("Be careful, your phone is running off.");
        if(charge > 0) {
            System.out.println("Phone is working.");
            charge -= 0.2;
        }
        if(charge <= 0)
            switch (switchPower) {
                case POWER_ON -> powerOff();
                case POWER_OFF -> System.out.println("Your phone is powered off, you can't use it");
            }
    }

    //toString
    @Override
    public String toString() {
        return String.format("> Color: %s", color.toString().toLowerCase());
    }
}