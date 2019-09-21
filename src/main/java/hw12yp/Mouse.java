package hw12yp;

public class Mouse {
    private String brand;
    private String color;
    private boolean wireless;
    private int maxBatteryLife;


    public Mouse(String brand, String color, boolean wireless, int maxBatteryLife) {
        this.brand = brand;
        this.color = color;
        this.wireless = wireless;
        this.maxBatteryLife = maxBatteryLife;
    }

    public void printInfo() {
        System.out.println("***** Mouse **** ");
        System.out.println("Brand: " +brand+ ", Color: " +color+ ", "+wireless+", Battery life: "+maxBatteryLife+ " months");
    }
}
