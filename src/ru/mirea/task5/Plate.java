package ru.mirea.task5;

public class Plate extends Dish{
    protected String pattern;
    protected int border_width;

    public Plate(){
        this.material = "фарфор";
        this.shape = "круглая";
        this.color = "белый";
        this.pattern = "без узора";
        this.border_width = 3;
    }

    public Plate(String material, String shape, String color, String pattern, int border_width, boolean forCooking){
        this.material = material;
        this.shape = shape;
        this.color = color;
        this.pattern = pattern;
        this.border_width = border_width;
    }

    public void setBorder_width(int border_width) {
        this.border_width = border_width;
    }

    public int getBorder_width() {
        return border_width;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                ", border_width=" + border_width +
                '}';
    }
}
