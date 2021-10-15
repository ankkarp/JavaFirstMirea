package ru.mirea.task15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        try {
            FileWriter myWriter = new FileWriter("src/ru/mirea/task15/text.txt");
            myWriter.write(line);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
