package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Elithabet", "Sokol", Position.ONCOLOGIST);
        Doctor doctor2 = new Doctor("Mike", "Tyson", Position.PHYSICIAN);

        Address address1 = new Address("Cardinal Ct.", "Wheeling", "IL", 60090);

        ArrayList<Doctor> arrayListOfDoctors = new ArrayList<>();
        arrayListOfDoctors.add(doctor1);
        arrayListOfDoctors.add(doctor2);

        HashMap<String, Integer> hmOfRooms = new HashMap<String, Integer>();
        hmOfRooms.put("PHYSICIANS", 100);
        hmOfRooms.put("ONCOLOGISTS", 101);

        ArrayList<InsuranseCompamies> insuransesAccepted = new ArrayList<>();
        insuransesAccepted.add(InsuranseCompamies.IC_1);
        insuransesAccepted.add(InsuranseCompamies.IC_2);
        insuransesAccepted.add(InsuranseCompamies.IC_3);
        insuransesAccepted.add(InsuranseCompamies.IC_4);
        insuransesAccepted.add(InsuranseCompamies.IC_5);

        Hospital hospital1 = new Hospital("Random Hospital", address1, arrayListOfDoctors, hmOfRooms, insuransesAccepted);
        hospital1.printInfo();
        hospital1.printDoctors();
        hospital1.printRooms();


    }










}
