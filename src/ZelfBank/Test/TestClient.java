package ZelfBank.Test;

import com.company.Client;

import java.io.*;
import java.util.HashMap;

public class TestClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //TASK-27
        //27 - пример использования HashMap для хранения информации о пользователях
        HashMap<Long, Client> clients = new HashMap<>();

        Client client1 = new Client("Dmitriy", "89037471972", "dmitriy-Ivanov@gmail.com", 18, "m",987654, clients);
        System.out.println(client1.printInfo());
        System.out.println("---------------------------------------");

        //TASK-29
        //29 - сериализация
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\1oran\\Downloads\\IdeaProjects\\Bank\\src\\com\\company\\saves\\save1.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(client1);
        objectOutputStream.close();


        //TASK-29
        //29 - десериализация
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1oran\\Downloads\\IdeaProjects\\Bank\\src\\com\\company\\saves\\save1.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Client client2 = (Client) objectInputStream.readObject();
        System.out.println(client2.printInfo());
    }
}