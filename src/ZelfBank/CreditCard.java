package ZelfBank;

import ZelfBank.Service.InfoSMSMailing;
import ZelfBank.Service.Service;
import ZelfBank.Service.InfoMailing;

public class CreditCard extends Card{

    double servicePay = 500;

    //конструктор
    public CreditCard(long number, double sum) {
        super(number, sum);
    }

    @Override
    public String balance() {
        return super.balance() + "\nСумма обслуживания: " + this.servicePay;
    }

    public void activateInfoMailing(){
        Service mailing = new InfoMailing("Рассылка информации о счете", 500);
        Service SMSing = new InfoSMSMailing(mailing);
        servicePay += SMSing.getPrice();
    }
}
