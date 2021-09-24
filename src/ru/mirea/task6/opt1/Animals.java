package ru.mirea.task6.opt1;

public class Animals implements Nameable {
    String name;

    public Animals(){
        name = "animal";
    }

    public Animals(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}
