package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener{
    int hp, x, y;
    Image player = new ImageIcon("src/ru/mirea/project/player.png").getImage();
    boolean isRunning = false;

    Game(){
        setFocusable(true);
        requestFocusInWindow();
    }

    public void begin(){
        isRunning = true;
        x = 150;
        y = 150;
    }

    public void paintComponent(Graphics g){
        System.out.println(x + ", " + y);
        super.paintComponent(g);
        hp = 3;
        g.drawImage(player ,x, y,this);
        setBackground(new Color(100, 100, 100));
    }

    public static void main(String[] args) {
        new Game();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x -= 10;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x += 10;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            y -= 10;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y += 10;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
}
