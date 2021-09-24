package ru.mirea.task7.shape;

public class Square extends Rectangle {
    public Square(){
        this.width = 1;
        this.length = 1;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}
