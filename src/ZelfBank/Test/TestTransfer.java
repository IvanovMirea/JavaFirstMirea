package ZelfBank.Test;

import ZelfBank.Transfer;

public class TestTransfer {
    public static void main(String[] args) {
        Transfer transfer = new Transfer(3000, true, 123, 321);
        transfer.showInfo();

        System.out.println("------------------------------------");

        //Task-28
        //28 - Создание анонимного класса для ЕДИНОРАЗОВОГО создания анонимного перевода
        Transfer secureTransfer = new Transfer(3000, true, 123, 321){
            @Override
            public void showInfo(){
                String line = "Информация о переводе скрыта одной из сторон" +
                        "\nСумма перевода: " + this.getSum();
                System.out.println(line);
            }
        };

        secureTransfer.showInfo();
    }
}
