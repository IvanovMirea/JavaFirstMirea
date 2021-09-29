package ru.mirea.task7.opt2;

public abstract class Shape2 {
    protected String color;
    protected boolean filled;
    public Shape2(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public double area()
    {
        return 0;
    }
    public double perimetr()
    {
     return 0;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isFilled(){
        return filled;
    }
    public abstract String toString();
}
