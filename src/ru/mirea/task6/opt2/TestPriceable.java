package ru.mirea.task6.opt2;

public class TestPriceable {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Computer computer = new Computer();
        Notebook notebook = new Notebook();
        Pen pen = new Pen();
        System.out.println(pen.getPrice());
        System.out.println(computer.getPrice());
        System.out.println(bread.getPrice());
        System.out.println(notebook.getPrice());
    }
}
