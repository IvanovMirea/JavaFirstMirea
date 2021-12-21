package ZelfBank;

public class Employee extends Person{

    //Task-17
    //17 - Создание перечисления профессий сотрудников банка
    enum position{
        lawyer, softwareEngineer, consultant, other
    }

    double salary;
    position pos;

    //конструктор
    public Employee(String name, String phoneNumber, String email, int age, String sex, double salary, String pos) {
        super(name, phoneNumber, email, age, sex);
        this.salary = salary;

        //17 - Присвоение полю с профессией сотрудника значения их перечисления position
        switch (pos) {
            case "lawyer":
                this.pos = position.lawyer;
                break;
            case "softwareEngineer":
                this.pos = position.softwareEngineer;
                break;
            case "consultant":
                this.pos = position.consultant;
                break;
            default:
                this.pos = position.other;
                break;
        }
    }

    //предоставление информации о сотруднике
    @Override
    public String printInfo() {
        return super.printInfo() + "\nзаработная плата: " + this.salary + "\nдолжность: " + this.pos;
    }
}
