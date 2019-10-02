package hw18_right_version;

import java.util.ArrayList;
import java.util.HashMap;


public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctor;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuaranceCompanies> insuarance;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctor, HashMap<Integer, String> rooms, ArrayList<InsuaranceCompanies> insuarance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctor = doctor;
        this.rooms = rooms;
        this.insuarance = insuarance;
    }


    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }
    public void printHospitalInfo(){

address.printAddress();
doctor.forEach(doc->doc.printDoctorInfo());
System.out.println("Hospital Name" +hospitalName);
rooms.forEach((roomNumber,roomName)-> System.out.println(roomNumber+"-->"+roomName));
System.out.println("Insuarances which Hospital is accepts are");
insuarance.forEach(insuarance-> System.out.println(insuarance));
        }
    }

