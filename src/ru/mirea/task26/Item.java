package ru.mirea.task26;

public class Item {
    private String name;
    private int price;
    private int k;

    public Item(String name, int price, int k) {
        this.name = name;
        this.price = price;
        this.k = k;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getK() {
        return k;
    }
}
