package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorAndFont extends JFrame {

    JTextArea area1 = new JTextArea("-", 8, 10);


    Font font1 = new Font("Calibri", Font.ITALIC, 15);
    Font font2 = new Font("Times New Roman", Font.PLAIN, 15);
    Font font3 = new Font("Century Gothic", Font.BOLD, 15);


    public ColorAndFont(){
        super("Menu + TextArea");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(350, 350);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);
        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem item1 = colorMenu.add(changeColorToBlue);
        JMenuItem item2 = colorMenu.add(changeColorToRed);
        JMenuItem item3 = colorMenu.add(changeColorToGreen);

        JMenuItem item4 = fontMenu.add(changeFontToTNR);
        JMenuItem item5 = fontMenu.add(changeFontToGoth);
        JMenuItem item6 = fontMenu.add(changeFontToCalibri);


        Container container = getContentPane();

        area1.setFont(new Font("Dialog", Font.PLAIN, 14));
        container.add(area1, BorderLayout.CENTER);

        setVisible(true);
    }

    Action changeColorToBlue = new AbstractAction("BLUE") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.blue);
        }
    };

    Action changeColorToRed = new AbstractAction("RED") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.red);
        }
    };

    Action changeColorToGreen = new AbstractAction("GREEN") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.green);
        }
    };

    Action changeFontToTNR = new AbstractAction("Times New Roman") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setFont(font2);
        }
    };

    Action changeFontToCalibri = new AbstractAction("Calibri") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setFont(font1);
        }
    };

    Action changeFontToGoth = new AbstractAction("Gothic") {
        @Override
        public void actionPerformed(ActionEvent e) {
            area1.setFont(font3);
        }
    };

    public static void main(String[]args)
    {
        new ColorAndFont();
    }
}
