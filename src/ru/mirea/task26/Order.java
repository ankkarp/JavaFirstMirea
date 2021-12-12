package ru.mirea.task26;

import java.util.*;

public class Order{
    ArrayList<Item> order = new ArrayList<>();
    int sum;

    public Order(ArrayList<Item> order) {
        this.order = order;
        this.sum = 0;
        for (Item item: order) {
            sum += item.getK() * item.getPrice();
        }
    }

    public int getSum() {
        return sum;
    }

    public void printCheck(){
        System.out.println("ИТОГ: \t" + Integer.toString(sum));
        for (Item item: order) {
            System.out.println(item.getName()+"\t"+Integer.toString(item.getPrice())+"x\t"
                    +Integer.toString(item.getK())+" =\t"+Integer.toString(item.getPrice()*item.getK()));
        }
    }
}
