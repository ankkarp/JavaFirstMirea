package ru.mirea.project;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    int hp, x, y;

    Game(){
        repaint();
    }

    public void paintComponent(Graphics g){
        hp = 3;
        x = 250;
        y = 250;
        while (hp != 0) {
            g.setColor(new Color(153, 13, 13));
            g.fillRect(x, y, 50, 50);;
        }
    }


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
}
