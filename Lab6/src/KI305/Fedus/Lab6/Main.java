package KI305.Fedus.Lab6;

import KI305.Fedus.Lab6.devices.DeviceInterface;
import KI305.Fedus.Lab6.devices.Refrigerator;
import KI305.Fedus.Lab6.devices.Smartphone;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        GoodsStorage goodsStorage = new GoodsStorage();

        //Make some objects
        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone(DeviceInterface.Color.BLACK);

        Refrigerator refrig1 = new Refrigerator();
        Refrigerator refrig2 = new Refrigerator(DeviceInterface.Color.YELLOW);
        Refrigerator refrig3 = new Refrigerator(DeviceInterface.Color.WHITE, 60);
        Refrigerator refrig4 = new Refrigerator(DeviceInterface.Color.BLACK, 80, 1.7, 0.5, 0.6);

        //Make goods for objects
        AbstractGood<Smartphone> agphone1 = new AbstractGood(phone1);
        AbstractGood<Smartphone> agphone2 = new AbstractGood(phone2, 500);

        AbstractGood<Smartphone> agrefrig1 = new AbstractGood(refrig1);
        AbstractGood<Smartphone> agrefrig2 = new AbstractGood(refrig2, 600);
        AbstractGood<Smartphone> agrefrig3 = new AbstractGood(refrig3, 500, LocalDateTime.of(2021, 12, 3, 5, 0));
        AbstractGood<Smartphone> agrefrig4 = new AbstractGood(refrig4, 650, LocalDateTime.of(2020, 4, 19, 13, 0), "Bosch");

        goodsStorage.addAGood(agphone1);
        goodsStorage.addAGood(agphone2);

        goodsStorage.addAGood(agrefrig1);
        goodsStorage.addAGood(agrefrig2);
        goodsStorage.addAGood(agrefrig3);
        goodsStorage.addAGood(agrefrig4);

        goodsStorage.printAll();
    }
}