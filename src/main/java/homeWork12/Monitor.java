package homeWork12;

public class Monitor {

    private double screen;
    private Color color;
    private Brand brand;
    private String model;
    public Monitor(Brand brand, String model, double screen, Color color){
        this.brand=brand;
        this.model=model;
        this.screen=screen;
        this.color=color;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    };

    public double getScreen() {
        return screen;
    }

    public Color getColor() {
        return color;
    }
    public void printMonitor(){
        System.out.println("\nMonitor- "+ brand+"\nModel- "+model+"\nScreen Size-"+ screen+"\n"+color);
    }
}
