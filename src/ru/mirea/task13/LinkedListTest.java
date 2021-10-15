package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> shapes = new LinkedList<String>();
        shapes.add("triangle");
        shapes.add("rectangle");
        shapes.addLast("square"); // добавляем на последнее
        shapes.addFirst("circle"); // добавляем на первое место
        shapes.add(1, "oval"); // добавляем элемент по индексу 1
        System.out.printf("There are %d elements \n", shapes.size());
        for(String shape : shapes){
            System.out.println(shape);
        }
        System.out.println(shapes.get(1));
        shapes.set(1, "polygon");
        System.out.printf("There are %d elements \n", shapes.size());
        for(String shape : shapes){
                System.out.println(shape);
            }
        // проверка на наличие элемента в списке
        if(shapes.contains("polygon")){
                System.out.println("There is a polygon");
            }
        shapes.remove("polygon");
        shapes.removeFirst(); // удаление первого элемента
        shapes.removeLast(); // удаление последнего элемента
        System.out.printf("There are %d elements \n", shapes.size());
        for(String shape : shapes){
            System.out.println(shape);
        }
    }
}
