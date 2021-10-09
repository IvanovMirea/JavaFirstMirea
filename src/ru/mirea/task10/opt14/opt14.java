package ru.mirea.task10.opt14;
import java.util.Scanner;

public class opt14 {
    public static String answer(int n){

        if(n < 10)
            return Integer.toString(n);
        else
            return answer(n/10) + " " + n % 10;}

    public static void main(String[] args){
        System.out.println("Введите Ваше натуральное число N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(answer(n));}
}