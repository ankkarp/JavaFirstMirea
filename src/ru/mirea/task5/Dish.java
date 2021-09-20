package ru.mirea.task5;

public abstract class Dish {
    protected String material, shape, color;

    public Dish(){
        this.material = "фарфор";
        this.shape = "круглая";
        this.color = "белый";
    }

    public Dish(String material, String shape, String color, boolean forCooking){
        this.material = material;
        this.shape = shape;
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String toString();
}
