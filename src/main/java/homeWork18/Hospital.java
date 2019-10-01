package homeWork18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Insurance> insurances;
    private ArrayList<Doctor> doctors;


    public Hospital(String hospitalName, Address address, ArrayList<Insurance> insurances, ArrayList<Doctor> doctors) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.insurances = insurances;
        this.doctors = doctors;

    }




    public void printInfo(){
        System.out.println("Hospital name is "+hospitalName);
        address.printInfo();
        doctors.forEach(doc->doc.printInfo());
        System.out.println("\nList of insurances: ");
        insurances.forEach(i -> System.out.println(i));
    }
}





