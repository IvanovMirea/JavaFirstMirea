package ZelfBank.Test;

import com.company.Client;
import com.company.DebitCard;
import java.util.HashMap;

public class TestDebitCard {

    public static void main(String[] args) {
        //TASK-27
        //27 - пример использования HashMap для хранения информации о пользователях и банкоматах
        HashMap<Long, Client> clients = new HashMap<>();
        HashMap<Long, Client> ATMs = new HashMap<>();

        DebitCard debitCard1 = new DebitCard(123456, 400);
        Client ATMMachine = new Client("ATM #1", "-", "-", -1, "-", 1, ATMs);
        Client client2 = new Client("Ilia", "89778116787", "2@.ru", 18, "m", 2, clients);

        System.out.println(debitCard1.balance());

        debitCard1.topUp(20, ATMMachine, client2);

        System.out.println(debitCard1.balance());
    }
}
