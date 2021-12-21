package ZelfBank.Test;

import ZelfBank.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "89778116787", ".ru", 19, "male");
        System.out.println(person1.printInfo());
        System.out.println("---------------------------------------");
    }
}
