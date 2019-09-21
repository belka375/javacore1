package lesson12;

public class Monitor {
    private String brand;
    private String model;
    private double screenSize;
    private String resolution;

    public Monitor(String brand, String model, double screenSize, String resolution){
        this.brand=brand;
        this.model=model;
        this.screenSize=screenSize;
        this.resolution=resolution;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void printMonitorInfo(){
        System.out.println("Monitor: "+model+" "+brand+" "+screenSize+" "+resolution);

    }
}
