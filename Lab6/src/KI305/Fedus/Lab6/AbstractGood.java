package KI305.Fedus.Lab6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AbstractGood<Good> {
    //Data fields
    private String fullGoodName;
    private double price = 0;
    private LocalDateTime deliveredDate;
    private LocalDateTime soledDate;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private Good good;

    //Constructors
    public AbstractGood(Good good){
        this.good = good;
        deliveredDate = LocalDateTime.now();
        fullGoodName = good.getClass().getSimpleName();
    }

    public AbstractGood(Good good, double price){
        this.good = good;
        this.price = price;
        deliveredDate = LocalDateTime.now();
        fullGoodName = good.getClass().getSimpleName();
    }

    public AbstractGood(Good good, double price, LocalDateTime deliveredDate){
        this.good = good;
        this.price = price;
        this.deliveredDate = deliveredDate;
        fullGoodName = good.getClass().getSimpleName();
    }

    public AbstractGood(Good good, double price, LocalDateTime deliveredDate, String fullGoodName){
        this.good = good;
        this.price = price;
        this.deliveredDate = deliveredDate;
        this.fullGoodName = fullGoodName;
    }

    //getter methods
    public double getPrice() {
        return price;
    }

    public LocalDateTime getDeliveredDate() {
        return deliveredDate;
    }

    public LocalDateTime getSoledDate() {
        return soledDate;
    }

    public String getFullGoodName() {
        return fullGoodName;
    }

    public Good getGood() {
        return good;
    }

    //setter methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeliveredDate(LocalDateTime deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    //sell
    public void toSell(){
        if(soledDate == null)
            soledDate = LocalDateTime.now();
        else
            System.out.println("Is already soled.");
    }

    //get good info
    public void getGoodInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format(">\t\t\t\t<\n> %s: %s$\n> Delivered date: %s\n> Soled date: %s\n%s\n>\t\t\t\t<\n",
                fullGoodName, (price == 0)?"The price isn't set":price, deliveredDate.format(DATE_FORMAT),
                (soledDate == null)?"Isn't soled":soledDate.format(DATE_FORMAT),
                good.toString());
    }
}