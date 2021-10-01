package ru.mirea.task8.shapes;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame{
    public Test(){
        super("Shape");
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        add(new DrawShapes());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args)
    {
        Test test = new Test();
    }
}
