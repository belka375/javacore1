package hw14;

public class Headset {
    private String brand;
    private int price;
    private String characteristics;


    public Headset(String brand, int price, String characteristics){
    this.brand=brand;
    this.price=price;
    this.characteristics=characteristics;}

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
