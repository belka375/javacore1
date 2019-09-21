package hw12yp;

public class Monitor {
    private String brand;
    private int screenSize;
    private String color;
    private int upc;


    public Monitor(String brand, int screenSize, String color, int upc) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.color=color;
        this.upc=upc;

    }

    public void printInfo() {
        System.out.println("***** Monitor **** ");
        System.out.println("Brand: " +brand+ ", Screen Size: "+screenSize+", Color: " +color+ ", UPC: " +upc);
    }
}
