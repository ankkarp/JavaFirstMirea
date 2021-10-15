package ru.mirea.task12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++)
        {
            students[i] = new Student();
        }
        int[] IDs = new int[n];
        for (int left = 0; left < n; left++)
        {
            int val = students[left].getiDNumber();
            int i = left - 1;
            for(; i>=0; i--)
            {
                if (val < students[i].getiDNumber()) {
                    students[i + 1].setiDNumber(students[i].getiDNumber());
                }
                else
                {
                    break;
                }
            }
            students[i+1].setiDNumber(val);
        }
        System.out.println("Sorted ID list:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(students[i].getiDNumber());
        }
    }
}
