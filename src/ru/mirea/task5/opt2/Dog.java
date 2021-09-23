package ru.mirea.task5.opt2;

public abstract class Dog {
    protected String fur;
    protected double age;

    public Dog(){
        fur = "Grey";
        age = 1;
    }

    public Dog(String fur, int age){
        this.fur = fur;
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public String getFur() {
        return fur;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public abstract String toString();
}