package ru.mirea.task25;

public class ShapeDecorator implements Shape{
    Shape shape;

    ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public void draw(){
        System.out.print("Draw a ");
        shape.draw();
    }
}
