package ru.mirea.task10.opt16;

import java.util.Scanner;

public class opt16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int max = 0;
        int k = 1;
        while (num != 0) {
            if (num > max) {
                max = num;
                k = 1;
            }
            else if (num == max){
                k++;
            }
            num = Integer.parseInt(sc.next());
        }
        System.out.print(k);
    }
}
