package ZelfBank;

public class Transfer {
    private double sum;
    private boolean approved;
    private long senderID;
    private long recipientID;

    //конструктор
    public Transfer(double sum, boolean approved, long senderID, long recipientID){
        this.sum  = sum;
        this.approved = approved;
        this.senderID = senderID;
        this.recipientID = recipientID;
    }

    public void showInfo(){
        String line = "Сумма перевода: " + this.sum +
                "\nID отправителя: " + this.senderID +
                "\nID получателя: " + this.recipientID;
        System.out.println(line);
    }

    public double getSum() {
        return sum;
    }
}
