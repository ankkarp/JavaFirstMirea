package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    CardLayout cardlayout = new CardLayout();
    JPanel all_pnls = new JPanel(cardlayout);
    JPanel menu_pnl = new JPanel(new GridBagLayout());
    JPanel game_pnl = new JPanel(new GridBagLayout());
    JPanel select_pnl = new JPanel(new GridBagLayout());
    JPanel settings_pnl = new JPanel(new FlowLayout());
    JPanel records_pnl = new JPanel(new FlowLayout());
    JButton select_btn = new JButton("PLAY");
    JButton records_btn = new JButton("RECORDS");
    JButton settings_btn = new JButton("SETTINGS");
    JButton exit_btn = new JButton("EXIT");
    JButton start_btn = new JButton("START");
    JButton menu_btn = new JButton("MENU");
    JButton menu2_btn = new JButton("MENU");
    JButton menu3_btn = new JButton("MENU");
    JLabel name_label = new JLabel("Name: ");
    JTextArea name_input = new JTextArea("Player1");
    Game game = new Game();
    JButton[] btns = {start_btn, records_btn, settings_btn, menu_btn, menu2_btn, menu3_btn, select_btn};
//task17
    enum LEVEL{EASY, NORMAL, HARD};
    JComboBox level_choice = new JComboBox(LEVEL.values());
    String[] table_headers = {"RANK", "SCORE", "DATE"};
    JTable records_tbl;
    JLabel rule = new JLabel("Name should only contain alphanumeric characters or _");

    //task19
    public void changePanel(ActionEvent evt) throws WrongName{
        try{
            if (!name_input.getText().matches("^[0-9a-zA-Z_]+$")){ //task24
                throw new WrongName("Wrong Name");
            }
            cardlayout.show(all_pnls, ((JButton) evt.getSource()).getText());
//task 23
            if ("START".equals(((JButton) evt.getSource()).getText())){
                game.begin();
            }
            System.out.println(name_input.getText());
        }catch(WrongName wrongName){
            rule.setForeground(Color.RED);
            System.out.println("Error");
        }
    }

//task18
    ActionListener navListener = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            try {
                changePanel(evt);
            } catch (WrongName e) {
                e.printStackTrace();
            }
        }
    };

    public Main(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu_pnl.add(select_btn);
        menu_pnl.add(records_btn);
        menu_pnl.add(settings_btn);
        menu_pnl.add(exit_btn);
        select_pnl.add(menu_btn);
        select_pnl.add(level_choice);
        select_pnl.add(start_btn);
        settings_pnl.add(menu2_btn);
        settings_pnl.add(name_label);
        settings_pnl.add(name_input);
        settings_pnl.add(rule);
        all_pnls.add(menu_pnl, "MENU");
        all_pnls.add(select_pnl, "PLAY");
        all_pnls.add(records_pnl, "RECORDS");
        all_pnls.add(settings_pnl, "SETTINGS");
        all_pnls.add(game, "START");
        cardlayout.show(all_pnls, "MENU");
        add(all_pnls);
        for (JButton btn: btns){
            btn.addActionListener(navListener);
        }
        exit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Data data = new Data();
        records_tbl = new JTable(data.getRecordsContent(), table_headers);
        records_tbl.getColumnModel().getColumn(2).setPreferredWidth(100);
        records_tbl.setEnabled(false);
        records_pnl.add(menu3_btn);
        records_pnl.add(records_tbl);
    }

    public static void main(String[] args) {
        new Main();
    }

    private class WrongName extends Exception {
        public WrongName(String message) {
            super(message);
        }
    }
}