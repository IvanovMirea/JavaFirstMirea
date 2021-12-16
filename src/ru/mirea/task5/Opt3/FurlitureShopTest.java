package ru.mirea.task5.Opt3;

public class FurlitureShopTest {
    static public void main(String[] args){
        FurnitureShop shopetester = new FurnitureShop(45, 28, 309);
        shopetester.displayInfo();
        System.out.println("Number of customers: " + shopetester.getNumberOfCustomers());
        shopetester.boughtForToday(13, 9);
        shopetester.displayInfo();
        shopetester.shipment(4, 0);
        shopetester.displayInfo();
    }
}
