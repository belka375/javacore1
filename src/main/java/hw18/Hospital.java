package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String name;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital (String name, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo() {
    address.printAddress();
        for (InsuranceCompanies insurance : acceptedInsurances) {
            System.out.println(insurance);
        }
    }

    public void printDoctors() {
        for (Doctor doc: doctors) {
            System.out.println(doctors);
        }
    }

        public void printDoctorRoom()

    {
            rooms.forEach((key, value) ->{
                System.out.println("specialty " +key + "room " + value);
            });
        }


}
