package ru.mirea.task5.opt1;

public abstract class Dish {
    protected String material, color;
    protected int radius;

    public Dish(){
        this.material = "porcelain";
        this.radius = 15;
        this.color = "white";
    }

    public Dish(String material, int radius, String color){
        this.material = material;
        this.radius = radius;
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String toString();
}
