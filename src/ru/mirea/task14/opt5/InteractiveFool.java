package ru.mirea.task14.opt5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class InteractiveFool extends JFrame {

    Font font = new Font("Century Gothic", Font.BOLD, 20);

    JButton start = new JButton("draw cards");
    JButton startRound = new JButton("New round");
    JLabel result = new JLabel();
    JTextField textField = new JTextField(15);
    String resultLine = "Введите карты";


    int counter = 0;
    int card1;
    int card2;

    Stack player1 = new Stack();
    Stack player2 = new Stack();

    public InteractiveFool(){
        super("BorderLayoutTest");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(900, 900);

        Container container = getContentPane();

        start.addActionListener(new InteractiveFool.ChangeInfo());
        container.add(start, BorderLayout.EAST);
        startRound.addActionListener(new InteractiveFool.NewRound());
        container.add(startRound, BorderLayout.WEST);

        textField.setForeground(Color.BLACK);
        container.add(textField, BorderLayout.NORTH);

        result.setFont(font);
        result.setText(resultLine);
        container.add(result, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ChangeInfo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String line1 = textField.getText();
            int number = Integer.parseInt(line1);
            Stack reverse = new Stack();


            for (int i = 0; i < 5; i ++){
                reverse.add(number%10);
                number = number / 10;
            }
            for (int i = 0; i < 5; i ++){
                Integer value = (Integer)reverse.pop();
                player2.push(value);
            }

            for (int i = 0; i < 5; i ++){
                reverse.add(number%10);
                number = number / 10;
            }
            for (int i = 0; i < 5; i ++){
                Integer value = (Integer)reverse.pop();
                player1.push(value);
            }
        }
    }

    private class NewRound implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            card1 = (int) player1.get(0);
            card2 = (int) player2.get(0);

            player1.remove(0);
            player2.remove(0);

            if (card1 == 0 && card2 == 9){
                player1.push(card1);
                player1.push(card2);
            }
            else if (card1 == 9 && card2 == 0){
                player2.push(card1);
                player2.push(card2);
            }
            else if (card1 > card2){
                player1.push(card1);
                player1.push(card2);
            }
            else {
                player2.push(card1);
                player2.push(card2);
            }

            counter++;

            if (player1.size() == 0)
                resultLine = ("second ");
            else if (player2.size() == 0)
                resultLine = ("first ");
            else if (counter > 105)
                resultLine = "botva";
            else resultLine = "Еще раунд!";

            result.setText(resultLine + " \n" + "Раунд: " + counter);
        }
    }

    public static void main(String[]args)
    {
        new InteractiveFool();
    }
}
