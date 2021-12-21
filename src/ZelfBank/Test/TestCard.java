package ZelfBank.Test;

import com.company.Card;
import com.company.CardFactory;
import com.company.cardType;

public class TestCard {

    public static void main(String[] args) {
        CardFactory factory = new CardFactory();
        Card card1 = factory.createCard(cardType.DEBIT, 3987, 90.0);
        Card card2 = factory.createCard(cardType.CREDIT, 122234, 900000.0);
        System.out.println(card1.balance());
        System.out.println("------------------------");
        System.out.println(card2.balance());

        //TASK-23
        //выполнение проверки работы метода hashCode()
        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());
    }
}
