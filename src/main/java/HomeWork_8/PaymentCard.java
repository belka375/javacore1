package HomeWork_8;

public class PaymentCard {

    public String paymentSystem;
    public String bank;
    public String currency;
    public boolean limit;
    public String type;
    public int serviceFee;

    public void printCardDetails() {
        System.out.println(type + " \n" + bank + " \n" + paymentSystem + " \nService fee " + serviceFee + "$ per year;");
    }

    public void printCurrency() {
        System.out.println(bank + " \n" + type + "\n" + currency + ";");
    }

}
