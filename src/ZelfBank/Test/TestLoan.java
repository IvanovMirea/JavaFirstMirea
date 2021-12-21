package ZelfBank.Test;

import ZelfBank.Loan;

public class TestLoan {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        Loan loan1 = new Loan(15000000.0, 2.4, 16, 37000, "Car");
        System.out.println(loan1.showInfo());
    }
}