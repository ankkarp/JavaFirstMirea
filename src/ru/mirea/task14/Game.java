package ru.mirea.task14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Game extends JFrame {
    JButton btn = new JButton("Open cards");
    JLabel open_card1 = new JLabel("Player1's card:  ");
    JLabel open_card2 = new JLabel("Player2's card:  ");
    JLabel all_cards1 = new JLabel("Player1's cards:  ");
    JLabel all_cards2 = new JLabel("Player2's cards:  ");
    JLabel turn = new JLabel("Turn: ");
    Panel panel = new Panel();
    int card1, card2;
    int k = 0;
    Deque<Integer> player1, player2;

    public Game(){
        player1 = new LinkedList<>();
        player2 = new LinkedList<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int number;
        for (int i = 0; i < 5; i++){
            number = (int) (Math.random() * numbers.size());
            player1.push(numbers.get(number)); //by index
            numbers.remove(number);
        }
        for (int i = 0; i < 5; i++){
            number = (int) (Math.random() * numbers.size());
            player2.push(numbers.get(number)); //by index
            numbers.remove(number);
        }
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(2, 3));
        add(panel);
        panel.add(open_card1);
        panel.add(turn);
        panel.add(open_card2);
        all_cards1.setText("Player1's cards: " + Arrays.toString(player1.toArray()));
        all_cards2.setText("Player2's cards: " + Arrays.toString(player2.toArray()));
        panel.add(all_cards1);
        panel.add(btn, BorderLayout.PAGE_END);
        panel.add(all_cards2);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.getText().equals("Take/give cards")){
                    if (card1 == 0 || (card1 > card2 && card2 != 0)){
                        player1.add(card1);
                        player1.add(card2);
                    }
                    else{
                        player2.add(card2);
                        player2.add(card1);
                    }
                    all_cards1.setText("Player1's cards: " + Arrays.toString(player1.toArray()));
                    all_cards2.setText("Player2's cards: " + Arrays.toString(player2.toArray()));
                    open_card1.setText("Player1's card:  ");
                    open_card2.setText("Player2's card:  ");
                    btn.setText("Open cards");
                }
                else if (player1.isEmpty()){
                    btn.setText("Player2 won!");
                    JOptionPane.showMessageDialog(panel, "Player2 won!",
                            "Game over", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (player2.isEmpty()) {
                    btn.setText("Player1 won!");
                    JOptionPane.showMessageDialog(panel, "Player1 won!",
                            "Game over", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (k == 106){
                    btn.setText("botva");
                    JOptionPane.showMessageDialog(panel, "botva",
                            "botva", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    card1 = player1.pop();
                    card2 = player2.pop();
                    open_card1.setText("Player1's card: " + card1);
                    open_card2.setText("Player2's card: " + card2);
                    turn.setText("Turn: " + ++k);
                    btn.setText("Take/give cards");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Game();
    }
}
