package hw18;
import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
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

    public Address getAddress() {
        return address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }
    public void printInfo(){
        System.out.println("\nHospital name: " + hospitalName + "\n");
        address.printInfo();
        System.out.println("\nDoctors: ");
        doctors.forEach(doc -> doc.printInfo());
        System.out.println("\nRooms: ");
        rooms.forEach((roomNumber, roomName)->System.out.println(roomNumber + ", " + roomName));
        System.out.println("\nInsurances: ");
        acceptedInsurances.forEach(i-> System.out.println(i));



    }
}
