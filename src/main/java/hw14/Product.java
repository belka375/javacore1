package hw14;

public class Product extends Seller{
    private String prodName;
    private double price;
    private hw14.Currency currency;

    public Product(String firstName, String lastName, int personId, String comName, double price, String prodName, Currency cur){
        super(firstName, lastName, personId, comName);
        this.prodName=prodName;
        this.price=price;
        this.currency=cur;
    }

    public void setprodName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrency(hw14.Currency currency) {
        this.currency = currency;
    }

    public String getprodName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() { return currency;
    }

    public void printProduct(){
        printSeller();
        System.out.println("Your product is: "+prodName+", price: "+price+" "+currency);
    }
}

