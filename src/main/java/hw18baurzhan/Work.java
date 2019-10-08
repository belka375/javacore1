package hw18baurzhan;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        var address = new Address("154 Main ave", "Elmwood Park", "NJ", 07700);
        var doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor("Peter","Shatz",Position.DOCTOR));
        doctors.add(new Doctor("Frank","Smile",Position.MANAGER));
        doctors.add(new Doctor("Michael","Mulls",Position.DOCTOR));
        doctors.add(new Doctor("Jane","Dole",Position.DOCTOR));
        doctors.add(new Doctor("Sarah","Smith",Position.DOCTOR));
        doctors.add(new Doctor("Samuel","Solo",Position.NURSE));

        var rooms = new HashMap<Integer,String>();
        rooms.put(12,"Doctors room");
        rooms.put(13,"Doctors room");
        rooms.put(14,"Doctors room");
        rooms.put(15,"Doctors room");
        rooms.put(16,"Doctors room");
        rooms.put(17,"Ultrasound room");
        rooms.put(18,"registrators room");
        rooms.put(19,"Accounter room");

        var acceptedIns=new ArrayList<InsuranseCompanies>();
        acceptedIns.add(InsuranseCompanies.AETNA);
        acceptedIns.add(InsuranseCompanies.BLUE_CROSS);
        acceptedIns.add(InsuranseCompanies.EMBLEM);
        acceptedIns.add(InsuranseCompanies.UHC);

        var hospital = new Hospital("Mount Zero",address,doctors,rooms,acceptedIns);
        hospital.printInfo();
    }
}
