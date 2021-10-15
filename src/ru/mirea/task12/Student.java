package ru.mirea.task12;

public class Student {
    private int iDNumber;
    private int score;

    public Student() {
        this.iDNumber = 200000 + (int)(Math.random()*100000);;
        this.score = (int)(Math.random()*100);
    }

    public int getiDNumber() {
        return this.iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", score=" + score +
                '}';
    }
}
