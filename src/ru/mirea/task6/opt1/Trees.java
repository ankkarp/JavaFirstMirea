package ru.mirea.task6.opt1;

public class Trees implements Nameable{
    String name;

    public Trees(){
        name = "tree";
    }

    public Trees(String name){
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
        return "Trees{" +
                "name='" + name + '\'' +
                '}';
    }
}
