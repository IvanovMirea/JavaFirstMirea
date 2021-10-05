package ru.mirea.task8.opt1;

import java.awt.*;

public class TriangleTask8 extends ShapeTask8 {
    public TriangleTask8(int x, int y, Color colour){
        super(x, y, colour);
    }

    public void Print (Graphics g)
    {
        g.setColor(getColour());
        g.fillPolygon(
                new int[]{
                        getX(),
                        (getX() - 100) + (int) (Math.random() * (getX() + 100)),
                        (getX() - 100) + (int) (Math.random() * (getX() + 100))},
                new int[]{
                        getY(),
                        (getY() - 100) + (int) (Math.random() * (getY() + 100)),
                        (getY() - 100) + (int) (Math.random() * (getY() + 100))},
                3 );
    }

}
