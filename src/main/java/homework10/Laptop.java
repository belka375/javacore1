package homework10;

public class Laptop {
    private String brand;
    private String color;
    private int[] price;

    public Laptop(){}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int[] getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Laptop(String color, String brand, int[] price){
        this.color=color;
        this.brand=brand;
        this.price=price;
    }
    public void printLaptopInfo(){
        System.out.println("This is a "+ getBrand()+" brand");
        System.out.println("It's color is " + getColor());
        System.out.println("It's price may be ");
        for (int pr:getPrice()
             ) {System.out.println(+ pr+"USD");

        }

    }
    public void print(){
        System.out.println("The brand is "+ brand +". It's " + color);
        System.out.println("It may cost ");
        for (int pr:price
             ) { System.out.println(+ pr);

        }
    }
}
