package ru.mirea.task8.opt1;

import java.awt.*;

public class Random2 extends ShapeTask8 {
    public Random2(int x, int y, Color colour) {
        super(x, y, colour);
    }

    public void Print(Graphics g)
    {
        g.setColor(getColour());
        g.fillRoundRect(
                getX(),
                getY(),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500));
    }

}