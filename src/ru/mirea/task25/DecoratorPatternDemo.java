package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        ShapeDecorator decor = new ShapeDecorator(rectangle);
        decor.draw();
        RedShapeDecorator red_decor = new RedShapeDecorator(circle);
        red_decor.draw();
    }
}