package hw18byTanik;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances){
        this.hospitalName=hospitalName;
        this.address=address;
        this.doctors=doctors;
        this.rooms=rooms;
        this.acceptedInsurances=acceptedInsurances;
    }

    public void printInfo(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.print("Address: ");
        address.printAddress();
        System.out.println("\nAccepted Insurances:");
        for (InsuranceCompanies insName:acceptedInsurances) {
            System.out.print(insName+", ");
        }
    }

    public void printDoctors(){
        System.out.println("\nHospital Doctors:");
        for (Doctor doctor:doctors) {
            doctor.printDoctor();
        }
    }
    public void printRooms(){
        System.out.println("Hospital Rooms: ");
        rooms.forEach((key,value)->{
            System.out.println("Room = "+ key+", "+value+"; ");
        });
    }
}
