package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Objects;

import static javax.swing.UIManager.put;

public class Main extends JFrame{
    JPanel ui = new JPanel(new GridBagLayout());
    CardLayout cardLayout = new CardLayout();
    JPanel cards = new JPanel(cardLayout);
    JButton menu_btn = new JButton("MENU");
    Game game = new Game(this, cardLayout, cards, ui, menu_btn);
    JButton select_btn = new JButton("PLAY");
    JButton records_btn = new JButton("RECORDS");
    JButton settings_btn = new JButton("SETTINGS");
    JButton exit_btn = new JButton("EXIT");
    JButton start_btn = new JButton("START");
    JLabel name_label = new JLabel("Name: ");
    String cur_player = "Player1";
    JTextArea name_input = new JTextArea(cur_player);
    Data data = new Data();
//task17
    enum LEVEL{EASY, NORMAL, HARD};
    JComboBox level_choice = new JComboBox(LEVEL.values());
    String[] table_headers = {"RANK","SCORE", "DATE"};
    JTable records_tbl;
    JButton[] buttons = {start_btn, records_btn, settings_btn, menu_btn, select_btn};
    JLabel rule = new JLabel("Name should only contain alphanumeric characters or _");

    //task19
    //task 23
    void loadPanel(String active) throws WrongName{
        try{
            if (!name_input.getText().matches("^[0-9a-zA-Z_]+$")){ //task24
                throw new WrongName("Wrong Name");
            }
            ui.removeAll();
            switch (active) {
                case "MENU" -> {
                    ui.add(select_btn);
                    ui.add(records_btn);
                    ui.add(settings_btn);
                    ui.add(exit_btn);
                }
                case "PLAY" -> {
                    ui.add(menu_btn);
                    ui.add(level_choice);
                    ui.add(start_btn);
                }
                case "RECORDS" -> {
                    records_tbl = new JTable(data.getRecordsContent(), table_headers);
                    records_tbl.getColumnModel().getColumn(2).setPreferredWidth(100);
                    records_tbl.setEnabled(false);
                    ui.add(menu_btn);
                    ui.add(records_tbl);
                }
                case "START" -> {
                    cardLayout.show(cards, "GAME");
                    ((Game) game).begin((LEVEL) (level_choice.getSelectedItem()), name_input.getText());
                }
                case "SETTINGS" -> {
                    ui.add(menu_btn);
                    ui.add(name_label);
                    ui.add(name_input);
                    ui.add(rule);
                }
                case "EXIT" -> System.exit(0);
            }
            ui.revalidate();
            ui.repaint();
        }catch(WrongName wrongName){
            rule.setForeground(Color.RED);
        }
    }

//task18
    ActionListener navListener = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            try {
                loadPanel(((JButton)evt.getSource()).getText());
            } catch (WrongName e) {
                e.printStackTrace();
            }
        }
    };

    public Main() throws WrongName {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1000,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        ui.setBackground(new Color(45/2, 40/2, 60/2));
        game.setBackground(new Color(45/2, 40/2, 60/2));
        cards.add(ui, "UI");
        cards.add(game, "GAME");
        add(cards);
        cardLayout.show(cards, "UI");
        loadPanel("MENU");
        for (JButton btn: buttons){
            btn.addActionListener(navListener);
        }
    }

    public static void main(String[] args) throws WrongName {
        new Main();
    }

    private class WrongName extends Exception {
        public WrongName(String message) {
            super(message);
        }
    }
}