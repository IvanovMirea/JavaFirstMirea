package ru.mirea.task1.opt6;

import java.util.Scanner;
import java.util.Random;

public class Opt6 {

    //Метод, реализующий сортировку пузырьком
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    //Вывод массива на экран
    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Реализация 4 варианта задания
    static void task4(){
        int n = 0;
        Scanner in = new Scanner(System.in);

        while (n <= 0){
            System.out.println("Введите длину массива 1");
            n = in.nextInt();
        }

        int[] array1 = new int[n];

        for (int i = 0; i < array1.length; i++){
            array1[i] = 1 + (int) (Math.random() * 1000);
        }

        System.out.println("Получившийся массив 1:");
        showArray(array1);

        bubbleSort(array1);

        System.out.println("Отсортированный массив 1:");
        showArray(array1);

        n = 0;

        while (n <= 0){
            System.out.println("Введите длину массива 2");
            n = in.nextInt();
        }

        int[] array2 = new int[n];
        final Random random = new Random();

        for (int i = 0; i < array1.length; i++){
            array2[i] = random.nextInt(1001);
        }

        System.out.println("Получившийся массив 2:");
        showArray(array2);

        bubbleSort(array2);

        System.out.println("Отсортированный массив 2:");
        showArray(array2);
    }

    public static void main(String[] args) {
        task4();
    }
}
