package ru.mirea.task5.opt1;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate();
        System.out.println(plate);
        Bowl bowl = new Bowl();
        System.out.println(bowl);
        Pan pan = new Pan();
        System.out.println(pan);
        plate.setColor("yellow");
        plate.setBorder_width(1);
        System.out.println(plate);
        bowl.setDepth(2);
        bowl.setBorder_width(2);
        System.out.println(bowl);
        pan.setMaterial("iron");
        pan.setNonStick(false);
        pan.setMaxT(300);
        System.out.println(pan);
    }
}
