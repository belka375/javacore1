package hw14;

import hw11.Currency;

public class Order extends Product {
    private DeliveryCity delcity;

    public Order(String prodName, double price, Currency currency, DeliveryCity delcity) {
        super(prodName, price, Currency currency);
        this.delcity = delcity;
    }

    public void printOrder() {
        printProduct();
        System.out.println("Your order will delivery to " + delcity);

    }
}
