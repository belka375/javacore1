package homeWork12;

public class Keyboard {
    private String brand;
    private String color;
    private String wireless;
    private double price;

    public Keyboard(String brand, String color, String wireless, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.wireless = wireless;
    }
    public void printKeyboard(){
        System.out.println("My Mouse is "+brand +"\nIt is "+ wireless+"; and color is "+color + "\nAnd it coast "+price+"$");
    }
}
