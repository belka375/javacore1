package hw14;


public class Order extends Product {
    private DeliveryCity delcity;

    public Order(String firstName, String lastName, int personId, String comName, double price, String prodName, Currency cur, DeliveryCity delcity) {
        super(firstName, lastName, personId, comName, price, prodName, cur);
        this.delcity = delcity;
    }

    public void setDelcity(DeliveryCity delcity) {
        this.delcity = delcity;
    }

    public DeliveryCity getDelcity() {
        return delcity;
    }

    public void printOrder() {
        printProduct();
        System.out.println("Your order will delivery to " + delcity);

    }
}
