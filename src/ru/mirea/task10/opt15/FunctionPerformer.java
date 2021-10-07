package ru.mirea.task10.opt15;

class FunctionPerformer {
    public FunctionPerformer(int num) {
        func(num);
    }

    public void func(int num) {
        if (num % 10 == num) {
            System.out.println(num);
        } else {
            func(num % 10);
            if (num < 10) {
                System.out.println(num);
            } else {
                func(num / 10);
            }
        }
    }
}