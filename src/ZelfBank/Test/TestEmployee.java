package ZelfBank.Test;

import com.company.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Danila", "89778556787", "4@.ru", 40,"",3000.0, "consultant");
        System.out.println(employee1.printInfo());
        System.out.println("---------------------------------------");
    }
}
