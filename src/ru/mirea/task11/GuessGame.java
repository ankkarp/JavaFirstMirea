package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessGame extends JFrame{
    JButton btn = new JButton("Guess");
    JTextField entry = new JTextField(2);
    JLabel flash = new JLabel("");
    int lives = 3;
    int answer = (int) (Math.random() * 20);

    public GuessGame(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entry.setSize(80, 5);
        btn.setSize(20, 5);
        add(entry);
        add(btn);
        add(flash);
        System.out.print(answer);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int guess =Integer.parseInt(entry.getText().trim());
                lives--;
                if (guess == answer){
                    flash.setText("You guessed right!");
                }
                else if (lives == 0){
                    flash.setText("Game over");
                }
                else if (guess < answer){
                    flash.setText("Think about a bigger number");
                }
                else{
                    flash.setText("Think about a smaller number");
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessGame();
    }
}
