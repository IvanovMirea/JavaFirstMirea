package ru.mirea.task3.opt2;

public class Head {
    private boolean hair;
    private double hairLength;
    private String eyeColor;

    public Head(boolean hair, String eyeColor, double hairLength){
        this.hair = hair;
        this.eyeColor = eyeColor;
        this.hairLength = hairLength;
    }

    public String toString(){
        return ("Have hair: " + hair + "    eye Color: " + eyeColor + "     hair length: " + hairLength);
    }
}
