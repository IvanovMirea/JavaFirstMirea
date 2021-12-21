package ZelfBank;

import java.io.Serializable;
import java.util.HashMap;

//TASK-29
//29 - создание класса, объекты которого будут иметь возможность сохранения
public class Client extends Person implements Serializable {

    long ID;
    //TASK-21
    //21 - ассоциативный список служит хранилищем недавних транзакций в виде: ID номер клиента, с которым была
    //произведена транзакция + сумма транзакции
    //TASK-27
    //27 - создание HashMap для хранения информации о недавних транзакциях
    HashMap<Long, Double> recentTransfers;

    //Конструктор
    public Client(String name, String phoneNumber, String email, int age, String sex, long ID, HashMap<Long, Client> clients) {
        super(name, phoneNumber, email, age, sex);
        this.ID = ID;

        //заносим данного клиента в общую базу
        clients.put(this.ID, this);
        //создаем массив недавних операций для данного пользователя
        this.recentTransfers = new HashMap<>();
    }

    public HashMap<Long, Double> getRecentTransfers() {
        return recentTransfers;
    }

    public long getID() {
        return ID;
    }

    //предоставление информации о клиенте
    @Override
    public String printInfo() {
        return super.printInfo() + "\nID: " + this.ID;
    }
}
