package ru.mirea.task5.Opt2;

public abstract class Dog {
    private String name;
    private int weight;

    public String getName(){return name;}
    public int getWeight(){return weight;}

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;

    }
    public abstract void breedInfo();
}