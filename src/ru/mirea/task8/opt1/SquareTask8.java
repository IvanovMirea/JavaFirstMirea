package ru.mirea.task8.opt1;

import java.awt.*;

public class SquareTask8 extends ShapeTask8 {
    private GradientPaint grad;
    private int x;
    private int y;

    public SquareTask8(int x, int y, Color colour){
        super(x, y, colour);
    }
    public void Print(Graphics g)
    {
        g.setColor(getColour());
        g.fillRect(
                getX(),
                getY(),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500));
    }

}
