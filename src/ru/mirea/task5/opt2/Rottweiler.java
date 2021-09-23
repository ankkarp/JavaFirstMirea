package ru.mirea.task5.opt2;

public class Rottweiler extends Dog{
    public Rottweiler(){
        fur = "Black & Rust";
        age = 1;
    }

    public Rottweiler(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Rottweiler{" +
                "fur='" + fur + '\'' +
                ", age=" + age +
                '}';
    }
}
