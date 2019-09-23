package hw12;

public class Monitor {
    private String brand;
    private int screenSize;

    public Monitor (String brand, int screenSize){
        this.brand=brand;
        this.screenSize = screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void printMonitor(){
        System.out.print("Monitor Brand: "+brand+"; Monitor Screen Size: "+ screenSize+";");
    }
}
