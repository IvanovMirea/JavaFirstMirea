package ru.mirea.task10.opt9;

public class NotZero {
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println("Существует "+recursion(5,8)+ " последовательностей, где 0 и 1 не стоят рядом");

    }
}
