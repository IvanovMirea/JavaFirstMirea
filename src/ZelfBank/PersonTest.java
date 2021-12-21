package ZelfBank;

class PersonTest {

    private String name = "Artemiy";
    private String phoneNumber = "89035467875";
    private String email = "1ArtemiyIvanov@gmail.com";
    private int age = 19;
    private Person.gender gen = Person.gender.male;

    @org.junit.jupiter.api.Test
    void printInfo() {
        System.out.println("Информация о пользователе " + this.name +
                "\nвозраст: " + this.age +
                "\nномер телефона: " + this.phoneNumber +
                "\nemail адрес: " + this.email +
                "\nпол: " + this.gen);
    }
}
