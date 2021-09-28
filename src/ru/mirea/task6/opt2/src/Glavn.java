public class Glavn {
    public static void main(String[] args){
        int price;
        String name;
        Priceable priceable = new Book ("Pochtampt", 3);
        price = priceable.getPrice();
        name = ((Book)priceable).getName();
        System.out.println("Name of this book is " +name+ " and price is " +price+ " dollars");
        priceable = new Alcohol ("Jack Daniels", 12);
        price = priceable.getPrice();
        name = ((Alcohol)priceable).getName();
        System.out.println("Name of this alcohol is "+name+" and it's coasts "+price+ " dollars ");

    }
}
