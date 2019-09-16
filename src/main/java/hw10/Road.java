package hw10;

import java.util.Arrays;

public class Road {
    private String road;
    private double length;
    private String[] crossStreets;
    private int speedLimit;

    public Road(String road, String lane, String[] crossStreets, int speedLimit, double length) {
        this.road = road;
        this.length = length;
        this.speedLimit = speedLimit;
        this.crossStreets = crossStreets;
    }
    public Road(){}

    public void setCrossStreets(String[] crossStreets) {
        this.crossStreets = crossStreets;
    }
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
    public void setRoad(String road) {
        this.road = road;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void getCrossStreets(String[] crossStreets) {
        this.crossStreets = crossStreets;
    }
    public void getSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
    public void getRoad(String road) {
        this.road = road;
    }
    public void getLength(double length) {
        this.length = length;
    }
    public void printRoad(){
        System.out.println(road+","+length+" miles"+","+"speedLimit "+speedLimit);
         {
             for(String crossSt:crossStreets){
                 System.out.print(crossSt);
             }
        }
    }
}
