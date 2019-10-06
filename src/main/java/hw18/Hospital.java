package hw18;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD

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


=======
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
>>>>>>> origin/AA81
