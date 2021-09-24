package ru.mirea.task5.opt3;

public abstract class Furniture {
    int price, depth, width, height;

    public Furniture(){
        price = 2000;
        depth = 50;
        width = 50;
        height = 80;
    }

    public Furniture(int price, int depth, int width, int height){
        this.price = price;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
