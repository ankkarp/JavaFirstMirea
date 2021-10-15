package ru.mirea.task13;

public class Test {
    public static void main(String[] args) {
        ArrayListCollection shapes = new ArrayListCollection();
        shapes.add("circle");
        System.out.println(shapes);
        shapes.add("square");
        shapes.add("triangle");
//        shapes.add(1, "oval");
        System.out.println(shapes.get(2));
        shapes.set(2, "rectangle");
        System.out.printf("There are %d elements \n", shapes.size());
        System.out.println(shapes);
        if (shapes.contains("triangle")) {
            System.out.println("There is a triangle");
        }
        shapes.remove("triangle");
        shapes.remove(0);
        System.out.printf("There are %d elements \n", shapes.size());
        System.out.println(shapes);
    }
}
