package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame extends JFrame{

    int counter = 0;
    int randomNumber = rnd(20);

    Font font = new Font("Century Gothic", Font.BOLD, 20);

    JButton guess = new JButton("Попрбовать");

    JLabel result = new JLabel();

    JTextField textField = new JTextField(2);

    String resultLine = "Введите число от 0 до 20! У вас 3 попытки";

    public GuessGame(){
        super("BorderLayoutTest");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(450, 450);

        Container container = getContentPane();

        guess.addActionListener(new GuessGame.ChangeInfo());
        container.add(guess, BorderLayout.SOUTH);

        textField.setForeground(Color.BLACK);
        container.add(textField, BorderLayout.NORTH);
        result.setForeground(Color.green);
        System.out.println(randomNumber);
        guess.setForeground(Color.BLACK);

        result.setFont(font);
        result.setText(resultLine);
        container.add(result, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ChangeInfo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            counter++;

            int fieldNumber = Integer.parseInt(textField.getText().trim());

            if(counter >=3)
                resultLine = "Game over :( Попробуйте снова!";
            else{
                if(randomNumber == fieldNumber)
                    resultLine = "Вы выйграли!";
                else{
                    if(randomNumber > fieldNumber)
                        resultLine = "Ваше число больше нашего :)";
                    else
                        resultLine = "Наше число больше вашего :)";
                }
            }
            result.setText(resultLine);
        }
    }

    static JFrame getFrame(){
        JFrame frame = new JFrame() {};
        frame.setVisible(true);
        frame.setBounds(250, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[]args)
    {
        new GuessGame();
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }
}