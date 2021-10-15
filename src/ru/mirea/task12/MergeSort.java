package ru.mirea.task12;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSort {
    Student[] students;

    public static void main(String[] args) {
        new MergeSort();
    }

    public MergeSort(){
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Student[] list1 = new Student[n1];
        Student[] list2 = new Student[n2];
        for (int i = 0; i < n1; i++){
            list1[i] = new Student();
        }
        for (int i = 0; i < n2; i++){
            list2[i] = new Student();
        }
        this.students = Stream.concat(Arrays.stream(list1), Arrays.stream(list2)).toArray(Student[]::new);
        mergeSort(0, students.length-1);
        output(students);
    }

    public void output(Student[] students) {
        System.out.println("Student list sorted by ID:");
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
    }

    void merge(int head, int tail)
    {
        int i = head, idx = 0,
                middle = head + (tail - head) / 2,
                j = middle + 1;
        Student[] res = new Student[tail-head + 1];
        while (i <= middle && j <= tail) {
            if (students[i].getiDNumber() <= students[j].getiDNumber()) {//элемент из левой половины меньше, чем элемент из правой
                res[idx] = students[i]; //записываем элемент из левой половины в новый элемент массива
                i++;
            }
            else {
                res[idx] = students[j]; //записываем элемент из левой половины в новый элемент массива
                j++;
            }
            idx++;
        }
        while (i <= middle) {
            res[idx] = students[i];
            i++;
            idx++;
        }
        while (j <= tail) {
            res[idx] = students[j];
            j++;
            idx++;
        }
        for (i = 0; i < idx; i++) { //заменяем часть массива на отсортированную
            if (students[head + i] != res[i]) {
                students[head + i] = res[i];
            }
        }
    }

    void mergeSort(int left, int right)
    {
        if (left < right) { //если массив состоит из 1ого элемента, то его не надо сортировать
            mergeSort(left, left + (right - left) / 2); //рекурсивный вызов функции для сортировки левой половины массива
            mergeSort(left + (right - left) / 2 + 1, right); //рекурсивный вызов функции для сортировки правой половины массива)
            merge(left, right); //слияние границ массивов
        }
    }
}
