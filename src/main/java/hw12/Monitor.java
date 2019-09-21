package hw12;

public class Monitor {
    private String name;
    private double screenSize;
    private String color;
    private double weight;
    private String displayType;

    public Monitor(String name,String color,double screenSize,String displayType,double weight){
        this.name=name;
        this.color=color;
        this.screenSize=screenSize;
        this.displayType=displayType;
        this.weight=weight;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public String getDisplayType() {
        return displayType;
    }
    public double getWeight() {
        return weight;
    }
    public void printMonitor(){
        System.out.println(name+" "+color+" "+screenSize+" "+displayType+" "+weight);
    }
}
