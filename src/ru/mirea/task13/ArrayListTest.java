package ru.mirea.task13;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> shapes = new ArrayList<String>();
        shapes.add("circle");
        shapes.add("square");
        shapes.add("triangle");
        shapes.add(1, "oval");
        System.out.println(shapes.get(2));
        for(String shape : shapes){
            System.out.println(shape);
        }
        shapes.set(2, "rectangle");
        System.out.printf("There are %d elements \n", shapes.size());
        for(String shape : shapes){
            System.out.println(shape);
        }
        if(shapes.contains("triangle")){
            System.out.println("There is a triangle");
        }
        shapes.remove("triangle");
        shapes.remove(0);
        Object[] obj_shapes = shapes.toArray();
        System.out.printf("There are %d elements \n", shapes.size());
        for(Object shape : obj_shapes){
            System.out.println(shape);
        }
    }
}
