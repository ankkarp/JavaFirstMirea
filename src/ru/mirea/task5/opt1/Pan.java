package ru.mirea.task5.opt1;

public class Pan extends Dish{
    protected boolean nonStick; //антипригарное покрытие
    protected int handleLength, maxT; //длина ручки, максимальная температура нагрева

    public Pan(){
        this.material = "aluminum";
        this.radius = 10;
        this.color = "grey";
        this.nonStick = true;
        this.handleLength = 17;
        this.maxT = 260;
    }

    public Pan(String material, int radius, String color, boolean nonStick, int handleLength, int maxT){
        this.material = material;
        this.radius = radius;
        this.color = color;
        this.nonStick = nonStick;
        this.handleLength = handleLength;
        this.maxT = maxT;
    }

    public boolean isNonStick() {
        return nonStick;
    }

    public void setNonStick(boolean nonStick) {
        this.nonStick = nonStick;
    }

    public int getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(int handleLength) {
        this.handleLength = handleLength;
    }

    public int getMaxT() {
        return maxT;
    }

    public void setMaxT(int maxT) {
        this.maxT = maxT;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                ", nonStick=" + nonStick +
                ", handleLength=" + handleLength +
                ", maxT=" + maxT +
                '}';
    }
}
