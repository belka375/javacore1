package hw12;

public class Monitor {
    private int diagonal;
    private Color color;
    private String brand;
    private String model;

    public Monitor(int diagonal, Color color, String brand, String model){
        this.brand=brand;
        this.diagonal=diagonal;
        this.color=color;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getDiagonal() {
        return diagonal;
    }
    public void printMonitorInfo(){
        System.out.println("Info about monitor: \n Brand: "+brand+"\n color: "+color+"\n Model: "+model+ "\n Diagonal: "+diagonal);
    }
}
