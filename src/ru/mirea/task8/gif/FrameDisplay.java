package ru.mirea.task8.gif;

import javax.swing.*;
import java.awt.*;

public class FrameDisplay extends JFrame {
    public FrameDisplay(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("test");
                frame.setSize(500, 500);
                JLabel jLabel = new JLabel("test");
                Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/gif/rotate.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);
                frame.add(jLabel);
                frame.setVisible(true);
            }
        });
    }
}
