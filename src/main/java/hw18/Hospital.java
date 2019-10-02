package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<Insurances> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<Insurances> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public ArrayList<Insurances> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public Address getAddress() {
        return address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void printInfo(){
        System.out.println(hospitalName+" Hospital");
        address.getAddressInfo();
        System.out.println("Insurance accepted:");
        for (Insurances ins:acceptedInsurances
             ) {
            System.out.println(ins);
        }
    }

    //Print list of doctors and their positions -
    public void printDoctors(){
        System.out.println("Doctors of "+ hospitalName+":");
        doctors.forEach(Doctor::getDoctor);
     // doctors.forEach(doctor -> {System.out.println(doctor.getLastName()+doctor.getName()+doctor.getPosition());});
    }

    //Print list of all offices with numbers and names
    public void printOffices(){
        rooms.forEach((key,value)->System.out.println("Room "+ key+" "+value));

    }
}
