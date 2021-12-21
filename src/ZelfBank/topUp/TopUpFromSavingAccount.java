package ZelfBank.topUp;

import ZelfBank.Client;

//TASK-26
//26 - описание одного из возможных способов пополнения счета (для шаблона проектирования "Стратегия")
public class TopUpFromSavingAccount implements TopUpStrategy {
    @Override
    public void topUp(double sum, Client sender, Client recipient) {
        sender.getRecentTransfers().put(recipient.getID(), sum);
        recipient.getRecentTransfers().put(sender.getID(), sum);
        System.out.println("Пополнено со счета");
    }
}