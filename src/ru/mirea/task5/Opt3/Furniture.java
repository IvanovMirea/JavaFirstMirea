package ru.mirea.task5.Opt3;

public abstract class Furniture {
    private int price;
    private String material;
    private double weight;

    public int getPrice() {return price;}

    public double getWeight() {return weight;}

    public String getMaterial() {return material;}

    public Furniture(int price, double weight, String material){
        this.price = price;
        this.weight = weight;
        this.material = material;
    }

    public abstract void displayInfo();
}
