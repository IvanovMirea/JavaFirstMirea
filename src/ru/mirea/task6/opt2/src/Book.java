class Book implements Priceable {
    private String name;
    private int price;
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    Book(String name, int price){
        this.name = name;
        this.price = price;
    }
}
