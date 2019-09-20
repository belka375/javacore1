package hw11;

public class CruiseDate {

    private String name;
    private int arrivalday;
    private Month[] arrivalmonth;

public CruiseDate(String name, int arrivalday, Month[] arrivalmonth){
    this.name=name;
    this.arrivalday=arrivalday;
    this.arrivalmonth=arrivalmonth;
}
public CruiseDate(){}


    public void setName(String name) {
        this.name = name;
    }

    public void setArrivalday(int arrivalday) {
        this.arrivalday = arrivalday;
    }

    public void setArrivalmonth(Month[] arrivalmonth) {
        this.arrivalmonth = arrivalmonth;
    }

    public String getName() {
        return name;
    }

    public int getArrivalday() {
        return arrivalday;
    }

    public Month[] getArrivalmonth() {
        return arrivalmonth;
    }
    public void printCruiseDateInfo() {
        System.out.println("Cruise arrival: Name: "+name+" Date: " +arrivalday);
        System.out.println("Arrival month ");
        for(Month thisyear : this.arrivalmonth) {
            System.out.println(thisyear);
        }
    }
}
