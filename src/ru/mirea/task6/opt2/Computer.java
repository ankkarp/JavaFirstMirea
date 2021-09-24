package ru.mirea.task6.opt2;

public class Computer {
    int price;

    public Computer(){
        this.price = 50000;
    }

    public Computer(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
