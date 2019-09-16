package homeWork10;

public class Glasses {

    private String brand;
    private int model;
    private String[] colors;
    private double price;

    public Glasses(String brand, int modelNumber, String[] avColors, double price){
        this.brand=brand;
        this.model=modelNumber;
        this.colors=avColors;
        this.price=price;
    }
    public Glasses(){}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int modelNumber) {
        this.model = modelNumber;
    }

    public void setColors(String[] avColors) {
        this.colors = avColors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public String[] getColors() {
        return colors;
    }

    public double getPrice() {
        return price;
    }

    public void printGlassesInfo() {
        System.out.println("Sunglasses - " + brand + ";\nModel number - "+ model);
        System.out.print("Available colors: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        System.out.println("Best price- " + price);
        System.out.println("------------------------------------------------------------------------------");
    }
}
