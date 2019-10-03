package hw15;

public class Cosmetic implements ProtoCoscmetic{
    private String brand;
    private String name;
    private Color color;
    private int  price;

    public Cosmetic(String brand, String name, Color color, int price) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println(name+" "+brand+" $"+price+" USD "+color );
    }

}


