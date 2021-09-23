package ru.mirea.task5.opt2;

public class Spaniel extends Dog{
    public Spaniel(){
        fur = "White & Yellow";
        age = 1;
    }

    public Spaniel(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Spaniel{" +
                "fur='" + fur + '\'' +
                ", age=" + age +
                '}';
    }
}
