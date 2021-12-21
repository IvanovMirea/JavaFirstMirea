package ru.mirea.task11.opt2;

import ru.mirea.task11.opt2.MouseTriggers.*;

import javax.swing.*;
import java.awt.*;

public class Navigation extends JFrame {

    JPanel[] panel = new JPanel[9];
    Font font = new Font("Century Gothic", Font.BOLD, 20);

    public Navigation() {
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for(int i = 0 ; i < panel.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(r,g,b));
            add(panel[i]);
        }

        panel[1].add(getLabel("Север", font));
        panel[1].addMouseListener(new NorthMouseTrigger());

        panel[3].add(getLabel("Запад", font));
        panel[3].addMouseListener(new WestMouseTracker());

        panel[4].add(getLabel("Центр", font));
        panel[4].addMouseListener(new CentralMouseTracker());

        panel[5].add(getLabel("Восток", font));
        panel[5].addMouseListener(new EastMouseTracker());

        panel[7].add(getLabel("Юг", font));
        panel[7].addMouseListener(new SouthMouseTracker());

        setSize(700,500);
    }

    static JLabel getLabel(String direction, Font font){
        JLabel label = new JLabel();
        label.setFont(font);
        label.setText(direction);
        return label;
    }


    public static void main(String[] args)
    {
        new Navigation().setVisible(true);
    }
}