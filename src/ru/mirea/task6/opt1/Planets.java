package ru.mirea.task6.opt1;

public class Planets implements Nameable{
    String name;

    public Planets(){
        name = "planet";
    }

    public Planets(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                '}';
    }
}
