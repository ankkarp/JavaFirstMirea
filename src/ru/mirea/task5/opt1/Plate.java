package ru.mirea.task5.opt1;

public class Plate extends Dish{
    protected int border_width;

    public Plate(){
        this.material = "porcelain";
        this.radius = 5;
        this.color = "white";
        this.border_width = 2;
    }

    public Plate(String material, int radius, String color, int border_width){
        this.material = material;
        this.radius = radius;
        this.color = color;
        this.border_width = border_width;
    }

    public void setBorder_width(int border_width) {
        this.border_width = border_width;
    }

    public int getBorder_width() {
        return border_width;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", radius='" + radius + '\'' +
                ", color='" + color + '\'' +
                ", border_width=" + border_width +
                '}';
    }
}
