package ru.mirea.task5.Opt3;

public class Shelving extends Furniture{
    double maxWeight;
    int numberOfSections;

    public Shelving(int price, double weight, String material, int numberOfSections, double maxWeight) {
        super(price, weight, material);
        this.maxWeight = maxWeight;
        this.numberOfSections = numberOfSections;
    }

    public void displayInfo(){
        System.out.println("Цена: " + super.getPrice() + "; вес: " + super.getWeight() + "; материал: " + super.getMaterial()
                + "; максимальный вес, который может быть размещен: " + this.maxWeight + "; кол-во секций: " + this.numberOfSections);
    }
}