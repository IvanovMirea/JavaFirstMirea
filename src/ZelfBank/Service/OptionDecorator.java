package ZelfBank.Service;

public class OptionDecorator implements Service{

    private  Service service;
    private  String label;
    private  double price;

    public OptionDecorator(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String getLabel() {
        return  this.label +service.getLabel();
    }
}