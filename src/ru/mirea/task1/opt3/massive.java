package ru.mirea.task1.opt3;

public class massive {
    public static void main(String[] args) {
        int Sum = 0;
        int[]a= new int[]{1,2,3};
        int i=0;
        while ( i < a[a.length - 1]) {
            Sum=Sum+a[i];
            i++;
        }
        System.out.println("Sum of digits ="+Sum);
    }
}
