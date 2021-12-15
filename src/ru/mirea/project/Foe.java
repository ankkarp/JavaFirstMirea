package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Foe {
    private Image image = new ImageIcon("src/ru/mirea/project/foe1.png").getImage();
    private int x0, y0, x1, y1, width, height, hp;

    public int getHp() {
        return hp;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Foe(int x, int y) {
        this.x0 = x;
        this.y0 = y;
        this.width = 32;
        this.height = 32;
        this.x1 = this.x0 + this.width;
        this.y1 = this.y0 + this.height;
        this.hp = 1000;
    }

    public Image getImage() {
        return image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public int getCenterX(){
        return (x0 + x1) / 2;
    }

    public int getCenterY(){
        return (y0 + y1) / 2;
    }
}
