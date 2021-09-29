package ru.mirea.task8.shapes;

public class Triangle extends Shape{
    protected int x1, y1, x2, y2;

    public Triangle(){
        super();
        x1 = this.x + (int) (Math.random() * 100);
        y1 = this.y + (int) (Math.random() * 100);
        x2 = this.x + (int) (Math.random() * 100);
        y2 = this.y + (int) (Math.random() * 100);
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }
}
