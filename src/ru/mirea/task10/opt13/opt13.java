package ru.mirea.task10.opt13;

import java.util.Scanner;

public class opt13 {
    public static void answer(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n > 0){
            System.out.println(n);
            int m = in.nextInt();
            if (m > 0)
                answer();
        }
    }

    public static void main(String[] args){
        System.out.println("последовательность чисел(одно число в строке): ");
        answer();
    }
}