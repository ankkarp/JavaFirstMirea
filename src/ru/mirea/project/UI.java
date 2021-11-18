package ru.mirea.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI extends JFrame{

    CardLayout cardlayout = new CardLayout();
    JPanel all_pnls = new JPanel(cardlayout);
    JPanel menu_pnl = new JPanel(new GridBagLayout());
    JPanel game_pnl = new JPanel(new GridBagLayout());
    JPanel start_pnl = new JPanel(new GridBagLayout());
    JPanel settings_pnl = new JPanel(new FlowLayout());
    JPanel records_pnl = new JPanel(new FlowLayout());
    JButton start_btn = new JButton("PLAY");
    JButton records_btn = new JButton("RECORDS");
    JButton settings_btn = new JButton("SETTINGS");
    JButton exit_btn = new JButton("EXIT");
    JButton begin_game_btn = new JButton("START");
    JButton menu_btn = new JButton("MENU");
    JButton menu2_btn = new JButton("MENU");
    JButton menu3_btn = new JButton("MENU");
    JButton[] btns = {start_btn, records_btn, settings_btn, menu_btn, menu2_btn, menu3_btn, begin_game_btn};
    JTextField textField = new JTextField();
    enum LEVEL{EASY, NORMAL, HARD};
    JComboBox level_choice = new JComboBox(LEVEL.values());
    String[] table_headers = {"RANK", "SCORE", "DATE"};
    JTable records_tbl;


    ActionListener navListener = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            try{
                cardlayout.show(all_pnls, ((JButton) evt.getSource()).getText());
            }catch(ClassCastException ignored){
                ;
            }

        }
    };

    public UI() {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(512, 512);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu_pnl.add(start_btn);
        menu_pnl.add(records_btn);
        menu_pnl.add(settings_btn);
        menu_pnl.add(exit_btn);
        start_pnl.add(menu_btn);
        start_pnl.add(level_choice);
        start_pnl.add(begin_game_btn);
        settings_pnl.add(menu2_btn);
        all_pnls.add(menu_pnl, "MENU");
        all_pnls.add(start_pnl, "PLAY");
        all_pnls.add(records_pnl, "RECORDS");
        all_pnls.add(settings_pnl, "SETTINGS");
        all_pnls.add(game_pnl, "START");
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
        ArrayList<String[]> table_content = new ArrayList<>();
        records_tbl = new JTable(data.getRecordsContent(), table_headers);
        records_tbl.setEnabled(false);
        records_pnl.add(menu3_btn);
        records_pnl.add(records_tbl);
    }

    public static void main(String[] args) {
        new UI();
    }
}