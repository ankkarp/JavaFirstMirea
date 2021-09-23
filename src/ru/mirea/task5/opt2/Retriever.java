package ru.mirea.task5.opt2;

public class Retriever extends Dog{
    public Retriever(){
        fur = "Golden";
        age = 1;
    }

    public Retriever(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Retriever{" +
                "fur='" + fur + '\'' +
                ", age=" + age +
                '}';
    }
}
