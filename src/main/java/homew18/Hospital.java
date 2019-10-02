package homew18;

import hw18baurzhan.Address;
import hw18baurzhan.Doctor;
import hw18baurzhan.InsuranseCompanies;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private hw18baurzhan.Address address;
    private ArrayList<hw18baurzhan.Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsurances;


    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo(){
        System.out.println("Hospital name = "+hospitalName);
        address.printInfo();
        doctors.forEach(doc->doc.printInfo());
        rooms.forEach((roomNumber,roomName)-> System.out.println(roomNumber+"-->"+roomName));
        System.out.println(" List of accepted insurances:");
        acceptedInsurances.forEach(i-> System.out.println(i));
    }
}

