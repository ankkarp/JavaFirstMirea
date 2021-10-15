package ru.mirea.task12;

import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator {
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new SortingStudentsByGPA(n);
    }

    public SortingStudentsByGPA(int n){
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++)
        {
            students[i] = new Student();
        }
        output(quickSort(students, 0, students.length - 1));
    }

    @Override
    public void output(Student[] students) {
        System.out.println("Student list sorted by GPA:");
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
    }

    @Override
    public Student[] quickSort(Student[] students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = students[(leftMarker + rightMarker) / 2].getScore();
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (students[leftMarker].getScore() > pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (students[rightMarker].getScore() < pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(students, leftBorder, rightMarker);
        }
        return students;
    }
}