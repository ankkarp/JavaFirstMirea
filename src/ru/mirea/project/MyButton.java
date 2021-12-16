package ru.mirea.project;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class MyButton extends JButton {
    MyButton(String text){
        super(text);
        setBackground(Color.GRAY);
    }
}
