package ru.mirea.task11.opt2.MouseTriggers;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NorthMouseTrigger implements MouseListener{
    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Добро пожаловать в Норвегию");
    }

    public void mouseExited(MouseEvent e) {}
}
