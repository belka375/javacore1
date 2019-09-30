package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInfo() {
        System.out.println("address: " + address);

        for (int i = 0; i < acceptedInsuranses.size(); i++) {
            System.out.println(acceptedInsuranses.get(i));
        }
    }

    public void printDoctors() {
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(doctors.get(i));
        }
    }
    public void printNumberOfficeAndName(){

    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public String getHospitalName() {
        return hospitalName;
    }
}
