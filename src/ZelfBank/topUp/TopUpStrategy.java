package ZelfBank.topUp;

import ZelfBank.Client;

//TASK-26
//26 - описание интерфейса для паттерна проектирования "Стратегия"
public interface TopUpStrategy {
    public void topUp(double sum, Client sender, Client recipient);
}
