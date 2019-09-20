package homeWork12;

public class Mouse {
    private String brand;
    private String color;
    private String  wireless;
    private double price;

    public Mouse(String brand, String color, String wireless, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.wireless = wireless;
    }
    public void printMouse(){
        System.out.println("My Mouse brand is "+brand +"\nIt is "+ wireless +"and color is "+color + "\nAnd it coast "+price+"$");
    }
}
