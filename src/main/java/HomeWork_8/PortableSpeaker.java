package HomeWork_8;

public class PortableSpeaker {
    public String brand;
    public String color;
    public int bateryLife;
    public boolean bluetooth;
    public double price;


    public void play() {
        System.out.println("Play cool music!");
    }

    public void lightShow() {
        System.out.println("Turn on rainbow light show");
    }


    public void printProductDetails() {
        System.out.println("Brand name - " + brand + ";\nColor - " + color + ";\nBatery life - " + bateryLife + ";");
    }

    public void printProductPrice() {
        System.out.println("Brand name - " + brand + "\nPrice - " + price + "$;");
    }

}
