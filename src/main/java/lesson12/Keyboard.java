package lesson12;

public class Keyboard {
    private String characteristics;
    private String color;
    private String brand;
public Keyboard(){}

    public void setColor(String color) {
        this.color = color;

    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void printKeyboard(){
        System.out.println("Keyboard by " +brand+". It's color is "+ color+". It's characteristics are: "+ characteristics );
    }
}