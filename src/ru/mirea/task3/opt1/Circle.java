package ru.mirea.task3.opt1;
public class Circle {
    private String type;
    private int radius;
    private String size;

    public Circle(String t, int r, String s) {
        type = t;
        radius = r;
        size = s;
    }

    public Circle(String s) {
        type = s;
        radius = 0;
    }

    public Circle() {
        type = "circle";
        radius = 0;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setSize(String size){
        this.size = size;
    }

    public String getType(String type) {
        return type;
    }

    public int getRadius() {
        return radius;
    }
    public String getSize(){
        return size;
    }
    public String toInfo() {
        return this.type + " , radius " + this.radius +" size is "+this.size;
    }
}
