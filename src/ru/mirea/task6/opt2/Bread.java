package ru.mirea.task6.opt2;

public class Bread implements Priceable{
    int price;

    public Bread(){
        this.price = 50;
    }

    public Bread(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
