package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    public void draw(){
        System.out.print("\nDraw a red ");
        shape.draw();
    }
}
