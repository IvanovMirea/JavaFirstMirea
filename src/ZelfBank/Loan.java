package ZelfBank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Loan extends Account{
    //Task-20
    //20 - добавление даты, до которой необходимо будет погасить кредит
    private Date date;
    private double monthPayment;
    private String guarantee;

    //конструктор
    public Loan(double sum, double percent, int period, double monthPayment, String guarantee) {
        super(sum, percent);
        this.monthPayment = monthPayment;
        this.guarantee = guarantee;

        //20 - Создание даты
        Date date = new Date();
        //20 - создание объекта для удобной работы с датами
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //20 - прибавляем к созданной дате кол-во месяцев, на которые был выдан кредит
        calendar.add(Calendar.MONTH, period);
        //20 - обновляем переменную с датой
        date = calendar.getTime();
        this.date = date;
    }

    //метод для отображения информации о кредите
    public String showInfo(){
        //20 - создание формата для даты и времени, чтобы выводить их в удобном формате
        //и отмести ненужную информацию
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

        return "Info about your loan:" +
                "\nsum: " + this.sum +
                "\nmonth Payment: " + this.monthPayment +
                "\nguarantee: " + this.guarantee +
                "\ndate: " + simpleDateFormat.format(this.date);
    }
}
