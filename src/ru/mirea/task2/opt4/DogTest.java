package ru.mirea.task2.opt4;

public class DogTest {
    public static void main(String[] args) {
        DogTask2 d1 = new DogTask2("Mike", 2);
        DogTask2 d2 = new DogTask2("Helen", 7);
        DogTask2 d3 = new DogTask2("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}