package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Cars cars = new Cars();
        Planets planets = new Planets();
        Trees trees = new Trees();
        System.out.println(animals.getName());
        System.out.println(cars.getName());
        System.out.println(planets.getName());
        System.out.println(trees.getName());
    }
}
