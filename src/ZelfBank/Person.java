package ZelfBank;

import com.company.validators.EmailValidator;
import com.company.validators.PhoneNumberValidator;

import java.io.Serializable;

//TASK-29
//29 - наследование от класса Serializable родителя класса Client для корректной работы сериализации
public class Person implements Serializable {

    //Task-17
    //17 - Создание перечисления гендеров
    //Task-28
    //28 - Создание вложенного класса(перечисления) для указания пола человека
    enum gender {
        male, female, other
    }

    private String name;
    private String phoneNumber;
    private String email;
    private int age;
    private gender gen;

    //конструктор
    public Person(String name, String phoneNumber, String email, int age, String sex){
        this.name = name;

        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        if (phoneNumberValidator.validate(phoneNumber))
            this.phoneNumber = phoneNumber;
        else {
            System.out.println("Введенный номер телефона не соответствует требованиям");
            this.phoneNumber = "not stated";
        }

        EmailValidator validator = new EmailValidator();

        if (validator.validate(email))
            this.email = email;
        else {
            System.out.println("Введенный email не соответствует требованиям");
            this.email = "not stated";
        }

        this.age = age;

        //17 - Присвоение полю с полом человека значения из перечисления gender
        switch (sex) {
            case "male":
                this.gen = gender.male;
                break;
            case "female":
                this.gen = gender.female;
                break;
            case "M":
                this.gen = gender.male;
                break;
            case "m":
                this.gen = gender.male;
                break;
            case "F":
                this.gen = gender.female;
                break;
            case "f":
                this.gen = gender.female;
                break;
            default:
                this.gen = gender.other;
                break;
        }
    }

    //предоставление информации о человеке
    public String printInfo(){
        return "Информация о пользователе " + this.name +
                "\nвозраст: " + this.age +
                "\nномер телефона: " + this.phoneNumber +
                "\nemail адрес: " + this.email +
                "\nпол: " + this.gen;
    }
}
