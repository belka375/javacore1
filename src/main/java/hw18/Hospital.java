package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private String name;
    private String lastName;
    private Position position;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;






    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void printDoctors(){

    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;

    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }
}
