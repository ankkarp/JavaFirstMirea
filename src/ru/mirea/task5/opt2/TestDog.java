package ru.mirea.task5.opt2;

import ru.mirea.task5.opt1.Bowl;
import ru.mirea.task5.opt1.Pan;
import ru.mirea.task5.opt1.Plate;

public class TestDog {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Retriever retriever = new Retriever();
        Rottweiler rottweiler = new Rottweiler();
        Shepherd shepherd = new Shepherd();
        Spaniel spaniel = new Spaniel();
        System.out.println(poodle);
        System.out.println(retriever);
        System.out.println(rottweiler);
        System.out.println(shepherd);
        System.out.println(spaniel);
        poodle.setAge(3);
        rottweiler.setFur("Black & Tan");
        System.out.println(poodle);
        System.out.println(rottweiler);
    }
}
