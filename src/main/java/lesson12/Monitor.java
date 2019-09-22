package lesson12;

public class Monitor {
    private String brand;
    private double resolution;
    private int size;

    public Monitor (String brand, double resolution, int size) {
    this.brand = brand;
    this.resolution = resolution;
    this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public double getResolution() {
        return resolution;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public void printMonitor () {
        System.out.println(brand + " " + resolution + " " +size);
    }
}
