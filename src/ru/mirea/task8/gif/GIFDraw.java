package ru.mirea.task8.gif;

import javax.swing.*;
import java.awt.*;

public class GIFDraw extends JPanel {
    Image img;

    public GIFDraw(){
        img = new ImageIcon("src/ru/mirea/task8/gif/rotate.gif").getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(img, 0, 0, null);
    }
}
