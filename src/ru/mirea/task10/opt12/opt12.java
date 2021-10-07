package ru.mirea.task10.opt12;

import java.util.Scanner;

public class opt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        String uneven = "";
        while (num != 0){
            if (num % 2 != 0){
                uneven += num + " ";
            }
            num = Integer.parseInt(sc.next());
        }
        System.out.print(uneven);
    }
}
