package homework18;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = (ArrayList<Doctor>) doctors;
        this.rooms = (HashMap<Integer, String>) rooms;
        this.acceptedInsuranses = (ArrayList<InsuranceCompanies>) acceptedInsuranses;
    }


    public void printInfo() {

        System.out.println(hospitalName);
        address.printInfo();
        doctors.forEach(doctor -> {

            doctor.printDoctors();
        });
        rooms.forEach((room, name) -> {
            System.out.println("Room number = " + room + " " + name);
        });

        for (InsuranceCompanies arrayElement : acceptedInsuranses) {
            System.out.println(arrayElement);
        }
        ;


    }
}
