package ru.mirea.task1.opt5;

public class Opt5 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Первые 10 элементов гармонического ряда: ");

        float n;

        for (int i = 1; i < 11; i++){
            n = 1/i;
            System.out.print(String.format("%,.2f", (1./i)) + "  ");
        }
    }
}
