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

        ArrayList<InsuranseCompanies> acceptedInsuranses1 = new ArrayList<>();
        acceptedInsuranses1.add(InsuranseCompanies.AETNA);
        acceptedInsuranses1.add(InsuranseCompanies.BlueCross);



        Address addr = new Address("4551 millenia", "Orlando", "FL", 32839);
        Address addr1 = new Address("5551 Vanguard", "Orlando", "FL", 32819);
        Hospital h1 =new Hospital("Winnie Palmer", addr,acceptedInsuranses);
        Hospital h2 = new Hospital("EM", addr1, acceptedInsuranses1);
        h1.printInfoH();
        System.out.println("______________________");
        h2.printInfoH();
        System.out.println("______________________");

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add( new Doctor("Ivan", "Ivanov", Position.DENTIST));
        doctors.add( new Doctor("Petr", "Petrovskiy", Position.HYROPRICTOR));
        doctors.add( new Doctor("Stepan", "Stepanov", Position.OBGYN));
        doctors.add( new Doctor("Sidor", "Sidorov", Position.SERGEON));
        for (Doctor doc:doctors
             ) {
           doc.printDoctor();
        }
        System.out.println("______________________");
        Map<Integer,String>rooms= new HashMap<>();
        rooms.put(202, "Dentistry");
        rooms.put(201,"Surgery");
        rooms.put(206,"Massage Cabinet");
        rooms.put(208, "Physician");
        for (Map.Entry<Integer, String> room:rooms.entrySet()){
            System.out.println("Room: " +room.getKey()+ "; Department: "+ room.getValue());



        }




    }
}
