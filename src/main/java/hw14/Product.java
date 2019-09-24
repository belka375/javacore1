package hw14;

import hw11.Currency;

public class Product {
    private String prodName;
    private double price;
    private Currency currency;

    public Product(String prodName, double price){
        this.prodName=prodName;
        this.price=price;
    }

    public void setprodName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getprodName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void printProduct(){
        System.out.println("Your product is: "+prodName+", price: "+price+" "+currency);;
    }
}

