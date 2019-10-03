package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work18 {
    public static void main(String[] args) {

        // я подглядывала в подсказки разбора

        var address = new Address("5643 South blvd", "Huston", "CO", 87444);
        var doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Alex", "River", Position.EMERGENCY_SPECIALIST));
        doctors.add(new Doctor("Mary", "Laviin", Position.ENT));
        doctors.add(new Doctor("Mike", "Penny", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Sofy", "Kale", Position.ONCOLOGIST));

        var rooms = new HashMap<Integer, String>();
        rooms.put(101, "Emergency room");
        rooms.put(102, "ENT Specialist Room");
        rooms.put(103, "Cardiologist Room");
        rooms.put(104, "Oncologst Room");
        rooms.put(110, "Hospital Manager");
        rooms.put(120, "Reception");

        var acceptIns = new ArrayList<InsuranseCompanies>();
        acceptIns.add(InsuranseCompanies.LA_CARE);
        acceptIns.add(InsuranseCompanies.OSCAR);
        acceptIns.add(InsuranseCompanies.MEDICAL);
        acceptIns.add(InsuranseCompanies.UNITED_HEALTH_CARE);
        acceptIns.add(InsuranseCompanies.KAIZER);

        var hospital = new Hospital("Green Hills", address, doctors, rooms, acceptIns);
        hospital.printInfo();
    }
}
