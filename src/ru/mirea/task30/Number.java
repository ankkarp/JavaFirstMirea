package ru.mirea.task30;

public class Number {
    static int operand1, operand2;

    public Number(int operand1, int operand2) {
        Number.operand1 = operand1;
        Number.operand2 = operand2;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        Number.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        Number.operand2 = operand2;
    }
    public static int sum(){
        return operand1+operand2;
    }

    public static double average(){
        return ((double)sum())/2;
    }

    public static int diff(){
        return (operand1>operand2)? operand1 - operand2: operand2 - operand1;
    }
}
