package ru.mirea.task13.opt1;

import java.util.ArrayList;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        ArrayList<String> list2 = new ArrayList<>(list);
        list2.add(0, "Amigo");

        System.out.println("List 2: " + list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println("Insert of list 2  to list 3: " + list3);
        list3.addAll(1, list2);
        System.out.println("Second insert of list 2 to list 3: " + list3);

        list.clear();
        System.out.println("List after clear(): " + list);

        ArrayList<String> copyOflist3 = (ArrayList<String>) list3.clone();
        System.out.println("Copy of third list: " + copyOflist3);

        System.out.println("Check for 'Hello': " + copyOflist3.contains("Hello"));
        System.out.println("Check for 'Check': " + copyOflist3.contains("Check"));

        System.out.println("Element 0 from list 2: " + list2.get(0));
        System.out.println("Index of 'Hello': " + list2.indexOf("Hello"));
        System.out.println("Is list 2 empty: " + list2.isEmpty());
        System.out.println("Last index of 'Hello' in list 2: " + list2.lastIndexOf("Hello"));
        list2.remove(0);
        System.out.println("List 2 without element 0: " + list2);
        list2.remove("Hello");
        System.out.println("List 2 without 'Hello': " + list2);

        list3.set(2, "HELLO");
        System.out.println("List 2: " + list3);

        System.out.println("Size of list 3: " + list3.size());

        System.out.println("String array:");
        String[] array = new String[list3.size()];
        list3.toArray(array);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
