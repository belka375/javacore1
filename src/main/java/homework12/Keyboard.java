package homework12;

public class Keyboard {
    private String keyboardType;
    private String keyboardBrand;
    private String keyboardColor;
    private double keyboardPrice;

    public Keyboard ( String type, String brand, String color, double price){
        this.keyboardType = type;
        this.keyboardBrand = brand;
        this.keyboardColor = color;
        this.keyboardPrice = price;
    }

    public double getKeyboardPrice() {
        return keyboardPrice;
    }

    public String getKeyboardBrand() {
        return keyboardBrand;
    }

    public String getKeyboardColor() {
        return keyboardColor;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void keyboardInfo() {
        System.out.println("Keyboard "+keyboardType+" "+" "+keyboardBrand+" "+keyboardColor+" "+keyboardPrice);
    }

}
