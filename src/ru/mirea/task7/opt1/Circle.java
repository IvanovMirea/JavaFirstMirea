package ru.mirea.task7.opt1;

class Circle extends Shape {

    private static final double PI = Math.PI;
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double ploshad(){
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
