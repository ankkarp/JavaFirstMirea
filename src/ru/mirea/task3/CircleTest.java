package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args){
        ru.mirea.task3.Circle circle = new ru.mirea.task3.Circle(1);
        System.out.println("r = " + circle.getRadius());
        circle.setRadius(2);
        System.out.println("r = " + circle.getRadius());
    }
}
