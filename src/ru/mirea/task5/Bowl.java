package ru.mirea.task5;

public class Bowl extends Plate{
    protected int depth;

    public Bowl(){
        this.material = "porcelain";
        this.radius = 5;
        this.color = "white";
        this.border_width = 0;
        this.depth = 3;
    }

    public Bowl(String material, int radius, String color, String pattern, int border_width, int depth){
        this.material = material;
        this.radius = radius;
        this.color = color;
        this.border_width = border_width;
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "depth=" + depth +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                ", border_width=" + border_width +
                '}';
    }
}
