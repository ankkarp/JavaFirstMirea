package ru.mirea.task8.shapes;

import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel{
    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        for (int i = 0; i < 20; i++){
            switch((int) (Math.random()*3)){
                case 0:
                    Rectangle rect = new Rectangle();
                    g.setColor(new Color(rect.getR(), rect.getG(), rect.getB()));
                    g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                    break;
                case 1:
                    Circle circle = new Circle();
                    g.setColor(new Color(circle.getR(), circle.getG(), circle.getB()));
                    g.fillOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    g.setColor(new Color(triangle.getR(), triangle.getG(), triangle.getB()));
                    int[] coordSetX = {triangle.getX(), triangle.getX1(), triangle.getX2()};
                    int[] coordSetY = {triangle.getY(), triangle.getY1(), triangle.getY2()};
                    g.fillPolygon(coordSetX, coordSetY, 3);
                    break;
            }

        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
}
