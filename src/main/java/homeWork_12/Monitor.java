package homeWork_12;

public class Monitor {

    private int size;
    private String brand;
    private String model;

    public Monitor(String brand, String model, double size) {
        this.brand = brand;
        this.model = model;
        this.size = (int) size;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public void printMonitorInfo() {
        System.out.println("Monitor info (brand/model/size) - " + brand + "/" + model + "/" + size + "in");
    }
}
