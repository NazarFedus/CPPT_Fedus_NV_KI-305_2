package KI305.Fedus.Lab6.devices;

public interface DeviceInterface {
    enum Power {
        POWER_OFF, POWER_ON
    }

    enum Color{
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }

    void powerOff();
    void powerOn();

    Color getColor();
}