package hw8;

public class Phone {
    public String model;
    public String os;
    public int price;

    public void phoneData() {
        System.out.println("Phone model: " + this.model);
        System.out.println("Phone OS: " + this.os);
        System.out.println("Phone price: $" + this.price);
    }
}
