public class Main {

    public static void main(String[] args) {
        String name;
        Nameable nameable = new Car("Nissan");
        name = nameable.getName();
        System.out.println("Car brand is "+name);
        nameable = new Dog("Bobby");
        name = nameable.getName();
        System.out.println("Dog's name "+name);
    }
}

