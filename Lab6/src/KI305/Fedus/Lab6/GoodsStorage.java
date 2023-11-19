package KI305.Fedus.Lab6;

import java.util.ArrayList;
import java.util.List;

public class GoodsStorage<Good extends AbstractGood> {
    //List of goods
    private List<Good> listOfGoods;
    private int MAX_CAPACITY;

    //Constructors
    public GoodsStorage() {
        MAX_CAPACITY = 40;
        listOfGoods = new ArrayList<>(MAX_CAPACITY);
    }

    public GoodsStorage(int capacity) {
        MAX_CAPACITY = capacity;
        listOfGoods = new ArrayList<>(MAX_CAPACITY);
    }

    //add a good
    public void addAGood(Good good){
        if(listOfGoods.size() == MAX_CAPACITY)
            System.out.println("The storage is full");
        else
            listOfGoods.add(good);
    }

    //take a good
    public Good takeAGood(int num){
        if(num >= 0 && num < MAX_CAPACITY)
        {
            Good template = listOfGoods.get(num);
            listOfGoods.remove(num);
            return template;
        }
        System.out.println("There is no a good with such id, try: 0 to " + (MAX_CAPACITY - 1));
        return null;
    }

    //print all goods
    public void printAll(){
        for (int i = 0; i < listOfGoods.size(); ++i)
            System.out.printf("Good #%s\n%s", i, listOfGoods.get(i));
    }
}