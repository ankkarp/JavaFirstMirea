package ru.mirea.task7.shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.filled = false;
        this.color = "none";
    }

    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.filled = true;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
