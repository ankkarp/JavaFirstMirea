package ru.mirea.project;

import javax.swing.*;
import java.awt.*;

public class Bullet {
    private Image image = new ImageIcon("src/ru/mirea/project/bullet1.png").getImage();
    private int x, y;
    private int speed = 15;

    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
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
        this.y -= 20;
    }
}
