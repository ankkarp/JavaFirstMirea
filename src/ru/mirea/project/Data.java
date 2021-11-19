package ru.mirea.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Data {
//task21
    ArrayList<String[]> table_content = new ArrayList<>();
    int n = 0;

    Data(){
//task18
        try {
            Scanner myReader = new Scanner(new File("src/ru/mirea/project/records.txt"));
            Date date = new Date();
            int[] new_record= new int[3];
            while (myReader.hasNextLine()) {
                table_content.add((myReader.nextLine().split("\\|")));
                n++;
            }
//task20
            SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            myReader.close();
            date.setTime(parseInt(table_content.get(table_content.size() - 1)[2]));
            table_content.get(table_content.size() - 1)[2] = String.valueOf(date_format.format(date));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int getN(){
        return n;
    }

    String[][] getRecordsContent(){
        return table_content.toArray(new String[0][0]);
    }
}
