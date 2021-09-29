package ru.mirea.task7.opt2;

class Rectangle extends Shape2 {

    public double wigth;
    protected double length;

    public Rectangle(double wigth,double length, String color, boolean filled) {
        super(color,filled);
        this.wigth = wigth;
        this.length = length;
    }

    public double getArea(){
        return wigth * length;
    }
    public double getPerimetr(){
        return  2 * (wigth + length);
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWigth(double wigth){
        this.wigth = wigth;
    }
    public double getLength(){
        return length;
    }
    public double getWigth(){
        return wigth;
    }

    public String toString(){
        return "Площадь прямоугольника "+this.getArea()+", а его периметр "+this.getPerimetr();
    }
}
