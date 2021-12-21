package ZelfBank;

//TASK-22
//22 - создаем фабрику для создания различных видов банковских карт
public class CardFactory {

    public Card createCard(cardType type, long number, double sum) {
        Card card = null;

        switch (type) {
            case DEBIT:
                card = new DebitCard(number, sum);
                break;
            case CREDIT:
                card = new CreditCard(number, sum);
                break;
        }
        return card;
    }
}
