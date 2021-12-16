package ru.mirea.project;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.*;

public class Attack {
    private Image image = new ImageIcon("src/ru/mirea/project/attack.png").getImage();
    private int x0, y0, d_x, d_y, width, height;
    private int speed = 10;
    private Game.ATTACKTYPE type;
    private double rad, deg;

    public double getDeg() {
        return deg;
    }

    public Attack(int x0, int y0, Game.ATTACKTYPE type, double deg) {
        this.x0 = x0;
        this.y0 = y0;
        this.type = type;
        this.deg = deg;
        this.rad = deg * Math.PI/180;
        this.d_x = (int) (cos(rad)*speed+0.5);
        this.d_y = (int) (sin(rad)*speed+0.5);
        width = 32;
        height = 32;
    }

    public int getX0() {
        return x0;
    }

    public Image getImage() {
        return image;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public void move(){
        this.y0 += d_y;
        this.x0 += d_x;
    }

    public int getCenterX(){
        return x0 + width/2;
    }

    public int getCenterY(){
        return y0 + height/2;
    }

    public int getX1(){
        return x0 + width;
    }

    public int getY1(){
        return y0 + height;
    }
}
