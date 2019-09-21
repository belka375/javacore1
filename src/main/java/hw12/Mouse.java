package hw12;

public class Mouse {
    private String color;
    private String name;
    private String wirelessConnection;
    private double batteryLife;

    public Mouse(String name,String color,String wirelessConnection,double batteryLife){
        this.name=name;
        this.color=color;
        this.wirelessConnection=wirelessConnection;
        this.batteryLife=batteryLife;
    }
    public String getName() {
       return name;
    }
    public String getColor() {
        return color;
    }
    public String getWirelessConnection() {
        return wirelessConnection;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public  void printMouse(){
        System.out.println("Brand:"+name+" "+color+" "+wirelessConnection+" connection"+","+batteryLife+"~battery life.");
    }
}
