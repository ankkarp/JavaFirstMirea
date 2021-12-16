package ru.mirea.project;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Objects;

import static javax.swing.UIManager.put;

public class Main extends JFrame{
    JPanel ui = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    CardLayout cardLayout = new CardLayout();
    JPanel cards = new JPanel(cardLayout);
    JButton menu_btn = new JButton("MENU");
    Data data = new Data();
    Game game = new Game(this, cardLayout, cards, ui, menu_btn, data, c);
    JButton select_btn = new JButton("PLAY");
    JButton records_btn = new JButton("RECORDS");
    JButton settings_btn = new JButton("SETTINGS");
    JButton exit_btn = new JButton("EXIT");
    JButton start_btn = new JButton("START");
    JLabel name_label = new JLabel("Name: ");
    String cur_player = "Player1";
    JTextArea name_input = new JTextArea(cur_player);
//task17
    enum LEVEL{EASY, NORMAL, HARD};
    JComboBox level_choice = new JComboBox(LEVEL.values());
    JTable records_tbl;
    JButton[] buttons = {start_btn, records_btn, settings_btn, menu_btn, select_btn, exit_btn};
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
                    c.gridy = 0;
                    ui.add(select_btn, c);
                    c.gridy = 1;
                    ui.add(records_btn, c);
                    c.gridy = 2;
                    ui.add(settings_btn, c);
                    c.gridy = 3;
                    ui.add(exit_btn, c);
                    rule.setForeground(new Color(224, 226, 255));
                }
                case "PLAY" -> {
                    c.gridy = 0;
                    ui.add(menu_btn, c);
                    c.gridy = 1;
                    ui.add(level_choice, c);
                    c.gridy = 2;
                    ui.add(start_btn, c);
                }
                case "RECORDS" -> {
                    records_tbl = new JTable(data.getScoreBoard(), data.getTableHeaders());
                    records_tbl.getColumnModel().getColumn(2).setPreferredWidth(125);
                    records_tbl.setEnabled(false);
                    c.gridy = 0;
                    ui.add(menu_btn, c);
                    c.gridy = 1;
                    ui.add(records_tbl, c);
                }
                case "START" -> {
                    c.gridy = 0;
                    cardLayout.show(cards, "GAME");
                    c.gridy = 1;
                    ((Game) game).begin((LEVEL) (level_choice.getSelectedItem()), name_input.getText());
                }
                case "SETTINGS" -> {
                    c.gridy = 0;
                    c.gridwidth = 2;
                    ui.add(menu_btn, c);
                    c.gridwidth = 1;
                    c.gridy = 1;
                    ui.add(name_label, c);
                    c.gridx = 1;
                    ui.add(name_input, c);
                    c.gridy = 2;
                    c.gridx = 0;
                    c.gridwidth = 2;
                    ui.add(rule, c);
                    c.gridwidth = 1;
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

        rule.setForeground(new Color(224, 226, 255));
        name_label.setForeground(new Color(224, 226, 255));
        name_input.setBackground(new Color(45/2, 40/2, 60/2));
        name_input.setForeground(new Color(224, 226, 255));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(1, 1, 1, 1);
        c.gridx = 0;
        ui.setBackground(new Color(45/2, 40/2, 60/2));
        game.setBackground(new Color(45/2, 40/2, 60/2));
        cards.add(game, "GAME");
        cards.add(ui, "UI");
        add(cards);
        cardLayout.show(cards, "UI");
        loadPanel("MENU");
        for (JButton btn: buttons){
            btn.addActionListener(navListener);
            btn.setBorder(BorderFactory.createEtchedBorder());
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