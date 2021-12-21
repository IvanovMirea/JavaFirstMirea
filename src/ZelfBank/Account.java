package ZelfBank;

public class Account {
    public double sum;
    public double percent;

    //конструктор
    public Account(double sum, double percent){
        this.percent = percent;
        this.sum = sum;
    }

    public String showInfo(){return "";}
}
