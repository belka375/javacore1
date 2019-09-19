package hw11;

public class Order {
    private int number;
    private double amount;
    private Currency currency;

    public Order(){

    }
    public Order (int number, double amount, Currency currency){
        this.number=number;
        this.amount=amount;
        this.currency=currency;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    public void printOrderInfo() {
        System.out.println("Order Information: Number " +number+", Price "+amount+" "+currency);

    }
}
