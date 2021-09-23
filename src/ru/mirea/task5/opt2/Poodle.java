package ru.mirea.task5.opt2;

public class Poodle extends Dog{
    public Poodle(){
        fur = "Apricot";
        age = 1;
    }

    public Poodle(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Poodle{" +
                "fur='" + fur + '\'' +
                ", age=" + age +
                '}';
    }
}
