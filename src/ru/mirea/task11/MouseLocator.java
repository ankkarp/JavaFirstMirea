package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseLocator extends JFrame{
    JPanel center = new JPanel();
    JPanel west = new JPanel();
    JPanel south = new JPanel();
    JPanel north = new JPanel();
    JPanel east = new JPanel();
    JLabel center_label = new JLabel("Добро пожаловать в Центр");
    JLabel west_label = new JLabel("Добро пожаловать на Запад");
    JLabel east_label = new JLabel("Добро пожаловать на Восток");
    JLabel north_label = new JLabel("Добро пожаловать на Север");
    JLabel south_label = new JLabel("Добро пожаловать на Юг");

    public MouseLocator(){
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        center_label.setVisible(false);
        center.add(center_label);
        add(center, BorderLayout.CENTER);
        west_label.setVisible(false);
        west.add(west_label);
        add(west, BorderLayout.WEST);
        south_label.setVisible(false);
        south.add(south_label);
        add(south, BorderLayout.SOUTH);
        north_label.setVisible(false);
        north.add(north_label);
        add(north, BorderLayout.NORTH);
        east_label.setVisible(false);
        east.add(east_label);
        add(east, BorderLayout.EAST);
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                center_label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                center_label.setVisible(false);
            }
        });

        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                east_label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                east_label.setVisible(false);
            }
        });

        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                west_label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                west_label.setVisible(false);
            }
        });

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                north_label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                north_label.setVisible(false);

            }
        });

        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                south_label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                south_label.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        new MouseLocator();
    }
}
