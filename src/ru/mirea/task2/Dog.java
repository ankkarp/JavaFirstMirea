package ru.mirea.task2;

public class Dog {
    private String breed, furColor;
    private int age;

    public Dog(String breed, String furColor, int age){
        this.breed = breed;
        this.furColor = furColor;
        this.age = age;
    }

    public Dog(){
        this.breed = "овчарка";
        this.furColor = "серая";
        this.age = 5;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFurColor(){
        return this.furColor;
    }

    public int getAge() {
        return this.age;
    }

    public String getBreed(){
        return this.breed;
    }

    public String toString(){
        return this.furColor + " " + this.breed + ", возраст: " + this.age;
    }
}
