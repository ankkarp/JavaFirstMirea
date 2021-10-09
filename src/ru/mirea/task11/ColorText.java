package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorText extends JFrame{
    String color_list[] = {"BLACK","RED", "GREEN", "BLUE" };
    String font_list[] = { "Times New Roman", "Helvetica", "Calibri", "Arial" };
    JComboBox font_choice;
    JComboBox color_choice;
    JTextField entry = new JTextField(100);

    public ColorText(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        font_choice = new JComboBox(font_list);
        color_choice = new JComboBox(color_list);
        entry.setSize(200, 200);
        entry.setFont(new Font(font_list[0], Font.PLAIN, 14));
        add(entry);
        add(font_choice);
        add(color_choice);
        color_choice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String color = (String) color_choice.getSelectedItem();
                switch(color){
                    case "BLACK":
                        entry.setForeground(Color.BLACK);
                        break;
                    case "RED":
                        entry.setForeground(Color.RED);
                        break;
                    case "GREEN":
                        entry.setForeground(Color.GREEN);
                        break;
                    case "BLUE":
                        entry.setForeground(Color.BLUE);
                        break;
                }
            }
        });

        font_choice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                entry.setFont(new Font((String) font_choice.getSelectedItem(), Font.PLAIN, 14));
            }
        });
    }

    public static void main(String[] args) {
        new ColorText();
    }
}
