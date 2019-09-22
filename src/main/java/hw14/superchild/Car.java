package hw14.superchild;

import java.time.LocalDateTime;

public class Car extends Owner{
    private CarMaker maker;
    private String model;

    public Car(String firstName, String lastName, LocalDateTime dob, CarMaker maker, String model){
        super(firstName,lastName,dob);
        this.model=model;
        this.maker=maker;
    }
    public void printCarInfo(){
        printOwner();
        System.out.println("Car maker "+maker.getMakerName()+" from "+maker.getCountry()+" Car model "+model);
    }
}
