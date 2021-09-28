package ru.mirea.task3.opt3;

public class BookTask3 {
    private String name;
    private int year;
    private String author;

    public BookTask3(String n, int y, String a) {
        name = n;
        year = y;
        author = a;
    }

    public BookTask3(String s) {
        name = s;
        year = 0;
        author = "Remark";
    }

    public BookTask3() {
        name = "small";
        year = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(String name) {
        return name;
    }

    public int getYear() {
        return year;
    }
    public String getAuthor(){
        return author;
    }

    public String toString() {
        return this.name + " , year " + this.year +" written by "+this.author;
    }
}
