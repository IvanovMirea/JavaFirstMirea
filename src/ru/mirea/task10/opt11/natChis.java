package ru.mirea.task10.opt11;

import java.util.Scanner;

public class natChis {
    public static int chisAnswer(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n == 1){
            int m = in.nextInt();
            if (m == 1)
                return chisAnswer() + n + m;
            else{
                int k = in.nextInt();
                if (k == 1)
                    return chisAnswer() + n + m + k;
                else
                    return n + m + k;}
        } else {
            int m = in.nextInt();
            if (m == 1)
                return chisAnswer() + n + m;
            else return n + m;
        }
    }

    public static void main(String[] args){
        System.out.println("Введите Последовательность натуральных чисел: ");
        System.out.println(chisAnswer());
    }
}
