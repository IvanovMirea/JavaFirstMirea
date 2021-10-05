package ru.mirea.task8.opt1;

import java.awt.*;

public abstract class ShapeTask8 {
    private int x;
    private int y;
    private Color colour;

    public ShapeTask8(int x, int y, Color colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", colour=" + colour +
                '}';
    }
}