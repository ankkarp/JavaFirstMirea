package ru.mirea.task6.opt1;

public class Cars implements Nameable{
    String name;

    public Cars(){
        name = "car";
    }

    public Cars(String name){
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
        return "Cars{" +
                "name='" + name + '\'' +
                '}';
    }
}
