package homeWork14;

public class Monitor extends Super {
    private String resolution;

    public Monitor(String brand, String model, Color color, double size, double weight, double warranty, String resolution){
        super(brand,model, color, size, weight, warranty);
        this.resolution=resolution;
    }

    public String getResolution() {
        return resolution;
    }
    public void printMonitor(){
        System.out.println("Monitor");
        printSuper();
        System.out.println(resolution);
    }
}
