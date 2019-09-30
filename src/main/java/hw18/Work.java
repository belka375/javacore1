package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[]args) {
        ArrayList<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.BlueCross);
        acceptedInsuranses.add(InsuranseCompanies.UnitedHealthCare);


        Address addr = new Address("4551 millenia", "Orlando", "FL", 32839, InsuranseCompanies.values());
        Address addr1 = new Address("5551 Vanguard", "Orlando", "FL", 32819, InsuranseCompanies.values());

        addr.printInfo();
        addr1.printInfo();

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add( new Doctor("Ivan", "Ivanov", Position.DENTIST));
        doctors.add( new Doctor("Petr", "Petrovskiy", Position.HYROPRICTOR));
        doctors.add( new Doctor("Stepan", "Stepanov", Position.OBGYN));
        doctors.add( new Doctor("Sidor", "Sidorov", Position.SERGEON));
        for (Doctor doc:doctors
             ) {
           doc.printDoctor();
        }

        Map<Integer,String>rooms= new HashMap<>();
        rooms.put(202, "Dentistry");
        rooms.put(201,"Surgery");
        rooms.put(206,"Massage Cabinet");
        rooms.put(208, "Physician");
        for (Map.Entry<Integer, String> room:rooms.entrySet()){
            System.out.println("Room: " +room.getKey()+ "; Department: "+ room.getValue());

              {
        }

        }




//
    }
}
