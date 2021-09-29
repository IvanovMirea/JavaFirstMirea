package ru.mirea.task7.opt2;

class Circle2 extends Shape2 {

    private static final double PI = Math.PI;
    protected double radius;

    public Circle2(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
    public double getPerimetr(){
       return  2 * PI * radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String toString(){
       return "Площадь круга "+this.getArea()+", а его периметр "+this.getPerimetr();
    }
}