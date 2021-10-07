package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramGUI extends JFrame {
    int milan_score = 0;
    int madrid_score = 0;
    JButton milan_btn = new JButton("Milan");
    JButton madrid_btn = new JButton("Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel scorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    public ProgramGUI(){
        setVisible(true);
        setLayout(new GridLayout(3, 2));
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(milan_btn);
        add(madrid_btn);
        add(result);
        add(scorer);
        add(winner);
        milan_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                milan_score++;
                result.setText("Result: " + milan_score + " X " + madrid_score);
                scorer.setText("Last Scorer: MILAN");
                if (milan_score==madrid_score){
                    winner.setText("Winner: DRAW");
                }
                else if(milan_score > madrid_score){
                    winner.setText("Winner: MILAN");
                }
            }
        });
        madrid_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                madrid_score++;
                result.setText("Result: " + milan_score + " X " + madrid_score);
                scorer.setText("Last Scorer: MADRID");
                if (milan_score == madrid_score){
                    winner.setText("Winner: DRAW");
                }
                else if(madrid_score > milan_score){
                    winner.setText("Winner: MADRID");
                }
            }
        });
    }

    public static void main(String[] args) {
        new ProgramGUI();
    }
}
