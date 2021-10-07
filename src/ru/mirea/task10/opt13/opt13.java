package ru.mirea.task10.opt13;

import java.util.Scanner;

public class opt13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        String uneven_ind = "";
        int i = 0;
        while (num != 0){
            if (i % 2 != 0){
                uneven_ind += num + " ";
            }
            num = Integer.parseInt(sc.next());
            i++;
        }
        System.out.print(uneven_ind);
    }
}
