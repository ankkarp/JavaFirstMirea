package ru.mirea.task8.image;

import javax.swing.*;
import java.awt.*;

public class ImageDraw extends JPanel {
    Image img;

    public ImageDraw(){
        img = new ImageIcon("src/ru/mirea/task8/image/mirea.PNG").getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(img, 0, 0, null);
    }
}
