package ru.mirea.task13;

import java.util.Arrays;

public class ArrayListCollection {
    String[] values;
    int size = 0;

    public String get(int i) {
        return values[i];
    }

    public void add(String el) {
        size++;
        String[] new_values = new String[size];
        for (int i = 0; i < size - 1; i++){
            new_values[i] = values[i];
        }
        new_values[size - 1] =  el;
        this.values = new String[size];
        this.values = new_values;
    }

    public void add(int index, String new_value) {
        size++;
        String[] new_values = new String[size];
        int i = 0;
        while (i < size - 1){
            if (i == index){
                new_values[i] = new_value;
            }else{
                new_values[i] = values[i];
                i++;
            }
        }
        this.values = new String[size];
        this.values = new_values;
    }

    public void set(int index, String new_value){
        values[index] = new_value;
    }

    public boolean contains(String value){
        for (String el : values){
            if (el.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        size--;
        String[] new_values = new String[size];
        int i = 0, j = 0;
        while (i < size + 1){
            if (i != index){
                new_values[j] = values[i];
                j++;
            }
            i++;
        }
        this.values = new_values;
    }

    public void remove(String value) {
        size--;
        String[] new_values = new String[size];
        int i = 0, j = 0;
        while (i < size){
            if (!values[i].equals(value)){
                new_values[j] = values[i];
                j++;
            }
            i++;
        }
        this.values = new_values;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "ArrayListCollection{" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                '}';
    }
}
