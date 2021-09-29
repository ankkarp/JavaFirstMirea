package ru.mirea.task8.shapes;

public class Rectangle extends Shape {
    protected int width, height;

    public Rectangle(){
        super();
        this.width = (int)(Math.random()*100);
        this.height = (int)(Math.random()*100);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.height = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
