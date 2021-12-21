package ZelfBank.Service;

public class InfoMailing implements Service {

    private  String label;
    private double price;

    public InfoMailing(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public void startMailing(){
        //TODO
        //описать взаимодействие с рассылкой сообщений
        System.out.println("Рассылка информационных сообщений успешно подключена");
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
