package ru.mirea.task3.opt2;

public class Hand {
    private boolean tattoo;
    private int numberOfFingers;

    public Hand(boolean tattoo, int numberOfFingers){
        this.tattoo = tattoo;
        this.numberOfFingers = numberOfFingers;
    }

    public String toString(){
        return ("Have tattoo: " + tattoo + "    number of fingers: " + numberOfFingers);
    }
}
