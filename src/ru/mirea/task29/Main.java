package ru.mirea.task29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo currencyInfo = new CurrencyInfo("Доллар", 73.44);
        SavedState savedState = new SavedState(new CurrencyInfo("Доллар", 73.44));
        try{
            FileOutputStream outputStream = new FileOutputStream("src/ru/mirea/task29/save1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(savedState);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("src/ru/mirea/task29/save1.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SavedState savedGame = (SavedState) objectInputStream.readObject();
            System.out.println(savedGame);
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
