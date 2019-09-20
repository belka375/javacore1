package homeWork12;

public class SystemBlock {
    private String brand;
    private String color;
    private double price;

    public SystemBlock(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void printSystemBlock(){
        System.out.println("My Mouse brand is "+brand + "and color is "+color + "\nAnd it coast "+price+"$");
    }

}
