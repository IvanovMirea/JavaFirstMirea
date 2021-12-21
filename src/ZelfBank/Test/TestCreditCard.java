package ZelfBank.Test;

import com.company.CreditCard;

public class TestCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234567, 500000);
        System.out.println(creditCard.balance());
        creditCard.activateInfoMailing();
        System.out.println(creditCard.balance());
    }
}
