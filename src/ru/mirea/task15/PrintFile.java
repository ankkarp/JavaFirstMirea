package ru.mirea.task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile {
    public static void main(String[] args) {
        try {
            Scanner myReader = new Scanner(new File("src/ru/mirea/task15/text.txt"));
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
