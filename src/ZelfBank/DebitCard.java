package ZelfBank;

import ZelfBank.topUp.TopUpFromATM;
import ZelfBank.topUp.TopUpStrategy;

public class DebitCard extends Card{

    //TASK-26
    //26 - создание поля для взаимодействия с шаблоном проектирования "Стратегия"
    TopUpStrategy topUpsStrategy;

    //конструктор
    public DebitCard(long number, double sum) {
        super(number, sum);

        //TASK-26
        //26 - создание полю необходимого для шаблона проектирования "стратегия" значения
        this.topUpsStrategy = new TopUpFromATM();
    }

    //вывод информации о карте
    @Override
    public String balance() {
        return super.balance();
    }

    //TASK-26
    //26 - реализация взаимодействия с шаблоном проектирования "Стратегия"
    public void topUp(double sum, Client sender, Client recipient){
        topUpsStrategy.topUp(sum, sender, recipient);
    }
}
