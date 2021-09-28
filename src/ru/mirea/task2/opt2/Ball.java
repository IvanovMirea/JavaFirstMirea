package ru.mirea.task2.opt2;

public class Ball {
    private String size;
    private int weight;

    public Ball(String s, int w) {
        size = s;
        weight = w;
    }

    public Ball(String s) {
        size = s;
        weight = 0;
    }

    public Ball() {
        size = "small";
        weight = 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize(String size) {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return this.size + " , weight " + this.weight;
    }
    public void inKilograms(){
        System.out.println(size+" 'weight in kilograms is "+weight*7+" size");
    }
}
