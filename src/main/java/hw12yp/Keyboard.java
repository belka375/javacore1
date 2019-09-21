package hw12yp;

public class Keyboard {
    private String brand;
    private String color;
    private int modelNumber;

    public Keyboard(String brand, String color, int model) {
        this.brand=brand;
        this.color=color;
        this.modelNumber=model;
    }


    public void printInfo() {
        System.out.println("***** Keyboard **** ");
        System.out.println("Brand: "+brand+", Color: "+color+", Model number: "+modelNumber);
    }
}
