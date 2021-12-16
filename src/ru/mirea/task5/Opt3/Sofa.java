package ru.mirea.task5.Opt3;

class Sofa extends Furniture{

    private int persons;
    private boolean bed;

    public Sofa(int price, double weight, String material, int persons, boolean bed) {
        super(price, weight, material);
        this.persons = persons;
        this.bed = bed;
    }

    public void displayInfo(){
        System.out.println("Цена: " + super.getPrice() + "; вес: " + super.getWeight() + "; материал: " + super.getMaterial()
                + "; может трансформироваться в кровать: " + this.bed + "; кол-во сидячих мест: " + this.persons);
    }
}
