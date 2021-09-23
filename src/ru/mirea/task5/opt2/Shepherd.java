package ru.mirea.task5.opt2;

public class Shepherd extends Dog{
    public Shepherd(){
        fur = "Black";
        age = 1;
    }

    public Shepherd(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Shepherd{" +
                "fur='" + fur + '\'' +
                ", age=" + age +
                '}';
    }
}
