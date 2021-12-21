package ZelfBank.Test;

import ZelfBank.Client;
import ZelfBank.SavingAccount;

import java.util.HashMap;

public class TestSavingAccount {
    public static void main(String[] args) {
        //TASK-27
        //27 - пример использования HashMap для хранения информации о пользователях
        HashMap<Long, Client> clients = new HashMap<>();

        SavingAccount savingAccount1 = new SavingAccount(0, 3);
        savingAccount1.predictSum(10, 9);

        //TASK-19
        //19 - Пытаемся закрыть счет, если на нем есть средства, выдаем сообщение
        try {
            savingAccount1.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Client client1 = new Client("Dmitriy", "89037471972", "1@.ru", 18, "m",1, clients);

        Client client2 = new Client("Ilia", "89778116787", "2@.ru", 18, "m", 2, clients);

        System.out.println(clients);

        SavingAccount savingAccount = new SavingAccount(2500, 3.4);
        savingAccount.topUp(2000, client2, client1);
    }
}
