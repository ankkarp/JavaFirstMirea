package ru.mirea.task8;

public abstract class Shape {
    protected int x, y, r, g, b;

    public Shape(){
        this.x = (int)(Math.random()*400);
        this.y = (int)(Math.random()*400);
        this.r = (int)(Math.random()*256);
        this.g = (int)(Math.random()*256);
        this.b = (int)(Math.random()*256);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setR(int r) {
        this.r = r;
    }
}
