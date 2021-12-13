package ru.mirea.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import static javax.swing.UIManager.put;

public class Main extends JFrame{
    JPanel pnl = new Game();
    JButton select_btn = new JButton("PLAY");
    JButton records_btn = new JButton("RECORDS");
    JButton settings_btn = new JButton("SETTINGS");
    JButton exit_btn = new JButton("EXIT");
    JButton start_btn = new JButton("START");
    JButton menu_btn = new JButton("MENU");
    JLabel name_label = new JLabel("Name: ");
    String cur_player = "Player1";
    JTextArea name_input = new JTextArea(cur_player);
    Game game = new Game();
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
            pnl.removeAll();
            switch(active){
                case"MENU":
                    pnl.add(select_btn);
                    pnl.add(records_btn);
                    pnl.add(settings_btn);
                    pnl.add(exit_btn);
                    break;
                case "PLAY":
                    pnl.add(menu_btn);
                    pnl.add(level_choice);
                    pnl.add(start_btn);
                    break;
                case "RECORDS":
                    records_tbl = new JTable(data.getRecordsContent(), table_headers);
                    records_tbl.getColumnModel().getColumn(2).setPreferredWidth(100);
                    records_tbl.setEnabled(false);
                    pnl.add(menu_btn);
                    pnl.add(records_tbl);
                    break;
                case "START":
                    game.begin();
                    break;
                case "SETTINGS":
                    pnl.add(menu_btn);
                    pnl.add(name_label);
                    pnl.add(name_input);
                    pnl.add(rule);
                    break;
                case "EXIT":
                    System.exit(0);
                    break;
            }
            pnl.revalidate();
            pnl.repaint();
        }catch(WrongName wrongName){
            rule.setForeground(Color.RED);
            System.out.println("Error");
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
        setSize(1000,1000);//параметры окошка
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//выход
        setResizable(false);//это запрет на изменение размера окна, на всякий случай
        setLocationRelativeTo(null);//для рамещения по центру, чтобы окно не ездило
        setVisible(true);
        add(pnl);
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