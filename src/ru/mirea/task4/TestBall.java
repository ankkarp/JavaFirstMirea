package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.setXY(2, 1);
        System.out.println(ball);
        ball.setX(10);
        System.out.println(ball);
        ball.setY(8);
        System.out.println(ball);
        ball.move(1, 2);
        System.out.println(ball);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }
}
