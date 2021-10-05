package ru.mirea.task9.opt1;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static javax.swing.SwingConstants.*;


public class FootballPredictor extends JFrame {
    private int barcelonaResult = 0;
    private int anjiResult = 0;
    JLabel resultLabel;
    JLabel lastScoreLabel;
    JLabel winnerLabel;

    public void frame() {
        JFrame frame = new JFrame("Football predictor");
        JButton btnBarcelona = new JButton("FC Barcelona");
        JButton btnAnji = new JButton("Anji");
        resultLabel=new JLabel();
        resultLabel.setForeground(Color.green);
        lastScoreLabel = new JLabel();
        lastScoreLabel.setForeground(Color.green);
        winnerLabel = new JLabel();
        winnerLabel.setForeground(Color.green);

        btnBarcelona.addActionListener(e->{
            updateScore("FC Barcelona");
            lastScoreLabel.setText("Last Scorer: Barcelona");
        });

        btnAnji.addActionListener(e->{
            updateScore("Anji");
            lastScoreLabel.setText("Last Scorer: Anji");
        });
        Container bottons = new JPanel(new GridLayout(1,2));
        Container labels = new JPanel(new GridLayout(3,1));
        resultLabel.setText("Result: "  + "0 X 0");
        lastScoreLabel.setText("Last Scorer: none");
        winnerLabel.setText("Winner: Tie ");

        labels.add(resultLabel);
        labels.add(lastScoreLabel);
        labels.add(winnerLabel);
        bottons.add(btnBarcelona);
        bottons.add(btnAnji);

        frame.setSize(1600, 835);
        frame.add(bottons, BorderLayout.SOUTH);
        frame.add(labels,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void updateScore(String team){
        if (team.equals("FC Barcelona"))
            barcelonaResult++;
        if (team.equals("Anji"))
            anjiResult++;
        resultLabel.setText("Result: " + barcelonaResult + " X "+ anjiResult);

        if(barcelonaResult > anjiResult)
            winnerLabel.setText("Winner: FC Barcelona" );
        else
            winnerLabel.setText("Winner: Anji" );
        if(barcelonaResult == anjiResult)
            winnerLabel.setText("Winner: Tie" );
    }
    public static void main(String[] args) {
        FootballPredictor go = new FootballPredictor();
        go.frame();
    }

}