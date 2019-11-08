package homeWork18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<Insurance> acceptedIns;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors,
                    HashMap<Integer, String> rooms, ArrayList<Insurance> acceptedIns) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms=rooms;
        this.acceptedIns = acceptedIns;
    }
    public void printInfoHosp() {
        System.out.println("Hospital - "+ hospitalName);
        address.printAdInfo();
        doctors.forEach(doc-> doc.printDocInfo());
        rooms.forEach((roomNumber, roomDoctor)->System.out.println("# "+ roomNumber +" -" + roomDoctor));
        System.out.println("Accepted Insurance:");
        acceptedIns.forEach(insurance -> System.out.println(insurance));

    }
}
