package ru.mirea.task3.opt2;

public class Leg {
    private int footSize;
    private boolean scars;

    public Leg(int footSize, boolean scars){
        this.footSize = footSize;
        this.scars = scars;
    }

    public String toString(){
        return ("Foot size: " + footSize + "    have scars: " + scars);
    }
}
