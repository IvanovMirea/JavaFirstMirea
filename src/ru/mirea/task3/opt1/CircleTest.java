package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("Circle ", 20," small");
        Circle c2 = new Circle("Circle ",50," medium");
        System.out.println(c1.toInfo());
        System.out.println(c2.toInfo());
    }
}
