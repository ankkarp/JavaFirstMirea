package ru.mirea.task8.shapes;

public class Circle extends Shape {
    int radius;

    public Circle() {
        radius = (int) (Math.random() * 100);
    }

    public int getRadius() {
        return radius;
    }
}
