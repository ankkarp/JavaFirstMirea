package ru.mirea.project;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.*;

public class Attack {
    private Image image = new ImageIcon("src/ru/mirea/project/bullet1.png").getImage();
    private int x, y, d_x, d_y;
    private int speed = 10;
    private Game.ATTACKTYPE type;
    private double rad, deg;

    public Attack(int x, int y, Game.ATTACKTYPE type, double deg) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.deg = deg;
        this.rad = deg * Math.PI/180;
        this.d_x = (int) (cos(rad)*speed+0.5);
        this.d_y = (int) (sin(rad)*speed+0.5);
    }

    public int getX() {
        return x;
    }

    public Image getImage() {
        return image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(){
        this.y += d_y;
        this.x += d_x;
    }
}
