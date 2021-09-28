package ru.mirea.task1.opt7;

public class factorial {
    public static void main(String[] args) {
        int fac = 1;
        int[]a= new int[]{1,2,3,4};
        int i=0;
        while ( i < a[a.length - 1]) {
            fac=a[i] * fac ;
            i++;
        }
        System.out.println("Factorial of digits ="+fac);
    }
}
