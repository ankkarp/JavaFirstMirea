package ru.mirea.project;

import javax.swing.*;
import java.awt.*;

public class Player {
    private Image image = new ImageIcon("src/ru/mirea/project/player.png").getImage();
    private int x0, y0, width, height, hp, speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public Player(int x, int y, int hp) {
        this.x0 = x;
        this.y0 = y;
        this.width = 8;
        this.height = 8;
        this.hp = hp;
        this.speed = 10;
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

    public void setImage(Image image) {
        this.image = image;
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

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getX0() {
        return this.x0;
    }

    public int getY0() {
        return this.y0;
    }

    public int getX1() {
        return this.x0 + this.width;
    }

    public int getY1() {
        return this.y0 + this.height;
    }

    public void takeDamage(){
        hp--;
    }

    public int getCenterX() {
        return (x0+getX1())/2;
    }

    public int getCenterY() {
        return (y0+getY1())/2;
    }

    public void move(int d_x, int d_y){
        x0 += d_x;
        y0 += d_y;
    }
}
