package homework12;

public class Monitor {
    private String monitorBrand;
    private int monitorSize;
    private double monitorPrice;

    public Monitor (String brand, int size, double price) {
        this.monitorBrand = brand;
        this.monitorSize = size;
        this.monitorPrice = price;
    }

    public double getMonitorPrice() {
        return monitorPrice;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorPrice(double monitorPrice) {
        this.monitorPrice = monitorPrice;
    }

    public void monitorInfo () {
        System.out.println("Monitor "+monitorBrand+" "+monitorSize+" "+monitorPrice);
    }
}
