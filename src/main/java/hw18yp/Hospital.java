package hw18yp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo(){
        System.out.println("Hospital name: "+hospitalName);
        address.printAddress();
        for (InsuranceCompanies a:acceptedInsurances){
            System.out.print(a+", ");
        }
        System.out.println();
    }
    public void printDoctors(){
        for (Doctor d:doctors){
            d.printDoctor();
        }
    }

    public void printRooms(){
        for (Map.Entry<Integer,String> pair:rooms.entrySet()){
            System.out.println("Room N = "+ pair.getKey()+", "+pair.getValue());
        }
        }
    }

