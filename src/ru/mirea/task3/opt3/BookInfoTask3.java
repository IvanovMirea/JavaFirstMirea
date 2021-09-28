package ru.mirea.task3.opt3;

public class BookInfoTask3 {
    public static void main(String[] args) {
        BookTask3 b1 = new BookTask3("Roman", 2020,"Smirnov");
        BookTask3 b2 = new BookTask3("Pochtamt",1950," Bukovcki");
        System.out.println(b1);
        System.out.println(b2);
        b1.toString();
        b2.toString();
    }
}