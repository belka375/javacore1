package hw10;
public class Plane {
    private String plane;
    private String color;
    private String size;
    private int seats;
    private int doors;
    private double fuelTankVolume;
     public Plane(String plane,String color,String size,int seats,int doors,double fuelTankVolume){
        this.plane=plane;
        this.color=color;
        this.size=size;
        this.seats=seats;
        this.doors=doors;
        this.fuelTankVolume=fuelTankVolume;
    }
    public Plane(){}
    public void setPlane(String plane) {
        this.plane = plane;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size){
        this.size=size;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setFuelTankVolume(double fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }
    public String getPlane() {
        return plane;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public int getSeats() {
        return seats;
    }
    public int getDoors() {
        return doors;
    }
    public double getFuelTankVolume() {
        return fuelTankVolume;
    }
    public void printPlaneInfo(){
        System.out.println( plane+","+color+"."+size+"."+"Seats:"+seats+"."+"Doors:"+doors+","+"Fuel tank:"+fuelTankVolume);
    }
}

