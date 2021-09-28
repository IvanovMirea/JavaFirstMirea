package ru.mirea.task2.opt3;

public class BookTask2 {
    private String name;
    private int value;

    public BookTask2(String n, int v) {
        name = n;
        value = v;
    }

    public BookTask2(String s) {
        name = s;
        value = 0;
    }

    public BookTask2() {
        name = "small";
        value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.name + " , value " + this.value;
    }
}
