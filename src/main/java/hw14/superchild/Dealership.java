package hw14.superchild;

import java.time.LocalDateTime;

public class Dealership extends Owner{
    private String dealershipName;
    private CarType[] type;
    private CarType ownerType;

    public Dealership(String dealershipName, String firstName, String lastName, LocalDateTime dob, CarType[] type, CarType popularType){
        super(firstName, lastName, dob);
        this.dealershipName=dealershipName;
        this.ownerType=popularType;
        this.type=type;
    }

    public void printDealershipInfo(){
        printOwner();
        System.out.println("In dealership "+dealershipName+" car type chosen by owner: "+ownerType+"\nfrom types: ");
        for (CarType t:type) {
            System.out.println(t);
        }
    }
}
