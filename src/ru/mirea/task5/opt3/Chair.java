package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    int legNumber;
    boolean hasBack;

    public Chair(){
        this.price = 1000;
        //this.length = 100;
        this.width = 100;
        this.legNumber = 4;
        this.hasBack = true;
    }

    public Chair(int price, int length, int width, int legNumber, boolean hasBack){

    }
}
