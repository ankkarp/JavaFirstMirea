package ru.mirea.task2;

public class Ball {
    private String type;
    private int weight, radius;

    public Ball(String type, int wgh, int r){
        this.type = type;
        this.weight = wgh;
        this.radius = r;
    }

    public void setWeight(int wgh) {
        this.weight = wgh;
    }

    public int getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public String toString(){
        return this.type+" ball, "+this.weight+"g "+this.radius+"cm";
    }
}
