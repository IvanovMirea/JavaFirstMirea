package ru.mirea.task7.opt2;
class Square extends Rectangle {
    public double side;

    public Square(double side, double length, double wigth, String color, boolean filled) {
        super(length, wigth,color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = wigth;
    }

    public void setLength(double side) {
        this.side = length;
    }

    public String toString() {
        return "Площадь квадрата  " + this.side * this.side + ", а его периметр " + this.side * 4;
    }
}
