class Car implements Nameable{
    private String name;
    public String getName(){
        return name;
    }
    Car(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Car brand "+name);
    }

}
