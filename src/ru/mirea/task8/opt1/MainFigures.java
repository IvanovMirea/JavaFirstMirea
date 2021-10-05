package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFigures extends JFrame{

    public MainFigures() throws HeadlessException {
        super("20 Случайных фигур!");
        setSize(1600, 805);
        setVisible(true);
    }

    public void frame(){
        JFrame frame= new JFrame("20 Случайных фигур!");
        JButton btn = new JButton("Сгенерировать еще");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new MainFigures());
            }
        });
        frame.setSize(1300, 835);
        frame.add(btn, BorderLayout.WEST);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int red;
        int green;
        int blue;
        SquareTask8 square;
        CircleTask8 crcl;
        TriangleTask8 trngle;
        Random2 rndrct;
        Random someArc;
        for (int i = 0; i < 20; i++)
        {
            red = (int) (Math.random() * 255);
            green = (int) (Math.random() * 255);
            blue = (int) (Math.random() * 255);
            switch (1 + (int) (Math.random() * 5)) {
                case (1) -> {
                    square = new SquareTask8(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    square.Print(g);
                }
                case (2) -> {
                    crcl = new CircleTask8(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    crcl.Print(g);
                }
                case (3) -> {
                    trngle = new TriangleTask8(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    trngle.Print(g);
                }
                case (4)-> {
                    rndrct = new Random2(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() *600),
                            new Color(red, green, blue));
                    rndrct.Print(g);
                }
                case(5)->{
                    someArc = new Random(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    someArc.Print(g);
                }
            }
        }
    }

    public static void main(String[] args) {
        MainFigures go = new MainFigures();
        go.frame();
    }
}
