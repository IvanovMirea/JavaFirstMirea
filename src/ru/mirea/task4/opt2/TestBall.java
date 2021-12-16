package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String args[]){
        Ball ball = new Ball(10.6, 150.7);
        System.out.println(ball.toString());

        ball.move(80.1, -300);
        System.out.println(ball.toString());

        ball.setXY(90, 90.99);
        System.out.println(ball.toString());

        ball.setX(-1.0);
        ball.setY(99.1);
        System.out.println(ball.toString());

        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

    }
}
