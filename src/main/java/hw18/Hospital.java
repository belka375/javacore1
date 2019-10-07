package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }


    public void printInfo(){
        System.out.println(hospitalName);
        address.printAddress();
        System.out.println("Accepted insurances: ");
        acceptedInsurances.forEach(ins-> System.out.println(ins));
        System.out.println("Doctors: ");
        doctors.forEach(doctor->doctor.printDoctors());
        rooms.forEach((roomNumber, roomName)-> System.out.println(roomNumber+roomName));


    }

}
