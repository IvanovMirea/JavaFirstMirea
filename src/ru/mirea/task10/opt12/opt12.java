package ru.mirea.task10.opt12;

import java.util.Scanner;

public class opt12 {
    public static void answer(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0){
            if (n % 2 == 1){
                System.out.println("Нечетное число последовательности | "+ n + " |");
                answer();
            } else
                answer();}
    }

    public static void main(String[] args){
        System.out.println("Приведите Вашу последовательность натуральных чисел:");
        answer();
    }
}