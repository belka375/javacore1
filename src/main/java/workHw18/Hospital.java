package workHw18;

import java.util.HashMap;
import java.util.ArrayList;


public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private ArrayList<InsuranceCompanies> acceptedInsurances;
    private HashMap<Integer, String> rooms;


    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.acceptedInsurances = acceptedInsurances;


    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }


    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }


    public void printInfo() {
        System.out.println("Hospital :" + " " + hospitalName);
        System.out.println("Address :");
        address.printAddress();
        System.out.println("Accepted Insurance List:");
        for (InsuranceCompanies acceptedInsurance : acceptedInsurances) {
            System.out.println(acceptedInsurance);
        }
    }

    public void printDoctors() {
        for (Doctor doctor : doctors) {
            doctor.printDoctor();
        }

    }
}


