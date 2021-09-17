package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball("football", 400, 11);
        System.out.println(ball);
        ball.setRadius(9);
        ball.setWeight(300);
        ball.setType("volleyball");
        System.out.println(ball);
        System.out.println(ball.getRadius());
        System.out.println(ball.getWeight());
        System.out.println(ball.getType());
    }
}
