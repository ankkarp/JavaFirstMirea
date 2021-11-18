package ru.mirea.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Data {
    ArrayList<String[]> table_content = new ArrayList<>();
    int n = 0;

    Data(){
        try {
            Scanner myReader = new Scanner(new File("src/ru/mirea/project/records.txt"));
            while (myReader.hasNextLine()) {
                table_content.add(myReader.nextLine().split("\\|"));
                n++;
            }
            myReader.close();
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
