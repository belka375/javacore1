package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap <Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms=rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public ArrayList<Doctor> getDoctors() {
//        return doctors;
//    }
//
//    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
//        return acceptedInsurances;
//    }
//
//    public HashMap<Integer, String> getRooms() {
//        return rooms;
//    }
//
//    public String getHospitalName() {
//        return hospitalName;
//    }

    public void printInfo() {
        System.out.println("Hospital name: "+hospitalName);
        System.out.println("Address:");
        address.printAddress();
        System.out.println("Accepted insurances:");
        for (InsuranceCompanies acceptedInsurance : acceptedInsurances) {
            System.out.println(acceptedInsurance);
        }
        printDoctors();
        printRooms();

    }
    public void printDoctors(){
        System.out.println("Hospital Doctors: ");
        for (Doctor doctor:doctors) {
                doctor.printDoctor();
           }

    }
    public void printRooms(){
        System.out.println("Rooms:");
        for (Map.Entry<Integer, String> pair : rooms.entrySet()) {
            System.out.println("Number: " + pair.getKey() + ", Name = " + pair.getValue());
        }
    }
}
