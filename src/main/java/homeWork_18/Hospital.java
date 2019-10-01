package homeWork_18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;
    private HashMap<Integer, String> rooms;


    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }


    public void printInfo() {
        System.out.println("Hospital: " + hospitalName);
        address.printAddress();
        System.out.println("Work with: " + acceptedInsuranses);
    }
}
