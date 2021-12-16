package ru.mirea.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Data {
//task21
    ArrayList<String[]> table_content = new ArrayList<>();
    int n;
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    String[] tableHeaders = {"SCORE","PLAYER", "DATE"};

    Data(){
//task18
        n = 0;
        try{
            Scanner myReader = new Scanner(new File("src/ru/mirea/project/records.txt"));
            Date date = new Date();
            while (myReader.hasNextLine()) {
                table_content.add(myReader.nextLine().split(","));
                n++;
            }
            //task20
            //task
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int getN(){
        return n;
    }

    String[][] getScoreBoard(){
        Collections.sort(table_content, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o2[0]), Integer.parseInt(o1[0]));
            }
        });
        return table_content.toArray(new String[0][0]);
    }

    String[] getTableHeaders(){
        return tableHeaders;
    }

    void updateFile(String[] newRecord){
        try {
            FileWriter myWriter = new FileWriter("src/ru/mirea/project/records.txt", true);
            myWriter.write(String.join(",", newRecord)+"\n");
            myWriter.close();
            table_content.add(newRecord);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
