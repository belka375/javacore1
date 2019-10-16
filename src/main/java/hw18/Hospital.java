package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;


    public Hospital(String name, Address address, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = name;
        this.address = address;
        this.acceptedInsuranses = acceptedInsuranses;


    }

    public void printInfoH() {
        address.printInfo();
        for (InsuranseCompanies comp :acceptedInsuranses) {
            System.out.println(comp);



        }
    }
}