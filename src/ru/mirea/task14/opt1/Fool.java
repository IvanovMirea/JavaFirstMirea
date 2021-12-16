package ru.mirea.task14.opt1;

import java.util.Scanner;
import java.util.Stack;

public class Fool {

    public void enter(Stack player){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int t = scanner.nextInt();
            player.add(t);
        }
    }

    public String round(Stack player1, Stack player2){
        int counter = 0;
        int card1;
        int card2;

        while ((counter < 105) && (player1.size() > 0) && (player2.size() > 0)) {

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
                return ("second " + counter);
            else if (player2.size() == 0)
                return ("first " + counter);
            else if (counter > 105)
                return "botva";
        }
        return "";
    }
    public static void main(String[] args) {

        Fool game = new Fool();
        Stack player1 = new Stack();
        Stack player2 = new Stack();

        game.enter(player1);
        game.enter(player2);

        System.out.println(game.round(player1, player2));
    }
}

