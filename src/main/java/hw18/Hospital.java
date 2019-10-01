package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor>doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies>acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }
    public void printInfo(){
        System.out.println("Hospital " +hospitalName);
        address.printAddress();
        doctors.forEach(doc -> doc.printDoctor());
        rooms.forEach((roomNumber, roomName)->System.out.println(roomNumber+" "+roomName));
        System.out.println("Accepted insurances: ");
        acceptedInsuranses.forEach(i -> System.out.println(i));
    }
}
