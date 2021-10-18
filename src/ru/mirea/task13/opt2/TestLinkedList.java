package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class TestLinkedList
{
    public static void main(String[] args)
    {

        String str1 = new String("Hello World!");
        String str2 = new String("Мой первый тест");
        String str3 = new String("Я больше по плюсам");
        String str4 = new String("Intellij - порой сложно");

        LinkedList<String> list = new LinkedList<>();
        list.add(str3);
        list.add(1, str2);
        list.addFirst(str1);
        list.addLast(str4);

        list.remove(1);
        System.out.println(list);

        System.out.println("Первый элемент: " + list.peekFirst());
        System.out.println("Последний элемент: " + list.peekLast());

        list.set(0, "Вставим в начало");
        System.out.println(list);

        System.out.println("Количество элементов: " + list.size());

        System.out.println("Index of 'Intellij - порой сложно': " + list.indexOf("Intellij - порой сложно"));

        System.out.println("Check for 'Hello World!': " + list.contains("Hello World!"));

        System.out.println("String array:");
        String[] array = new String[list.size()];
        list.toArray(array);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
