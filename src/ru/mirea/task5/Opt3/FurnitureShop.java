package ru.mirea.task5.Opt3;

public class FurnitureShop {
    private int numberOfSofas;
    private int numberOfShelvings;
    private int numberOfCustomers;

    public FurnitureShop(int numberOfShelvings, int numberOfSofas, int numberOfCustomers) {
        this.numberOfShelvings = numberOfShelvings;
        this.numberOfSofas = numberOfSofas;
        this.numberOfCustomers = numberOfCustomers;
    }

    public int getNumberOfCustomers() {return numberOfCustomers;}

    public void boughtForToday(int shelvings, int sofas){
        this.numberOfShelvings -= shelvings;
        this.numberOfSofas -=sofas;
    }

    public void shipment(int shelvings, int sofas){
        this.numberOfShelvings += shelvings;
        this.numberOfSofas +=sofas;
    }


    public void displayInfo(){
        System.out.println("Количество стелажей: " + this.numberOfShelvings + " количество диванов: " + this.numberOfSofas +
                " количество поситителей: " + this.numberOfCustomers);
    }
}
