package ZelfBank.topUp;

import com.company.Client;

//TASK-26
//26 - описание одного из возможных способов пополнения счета (для шаблона проектирования "Стратегия")
public class TopUpFromATM implements TopUpStrategy {

    @Override
    public void topUp(double sum, Client ATM, Client recipient) {
        recipient.getRecentTransfers().put(ATM.getID(), sum);
        System.out.println("Пополнено из банкомата");
    }
}
