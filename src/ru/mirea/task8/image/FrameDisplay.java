package ru.mirea.task8.image;

import javax.swing.*;

public class FrameDisplay extends JFrame {
    public FrameDisplay(){
        ImageDraw image = new ImageDraw();
        setSize(500, 500);
        setVisible(true);
        add(image);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FrameDisplay frameDisplay = new FrameDisplay();
    }
}
