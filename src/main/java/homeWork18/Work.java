package homeWork18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {

    public static void main(String[] args) {

        var adress = new Address("11 Main St", "New Springfield", "NJ", 88242);

        var doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor("Fill", "Jacson", Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("John", "Smith", Position.ALLERGIST));
        doctors.add(new Doctor("Elly", "Paterson", Position.IMMUNOLOGIST));
        doctors.add(new Doctor("Sam", "Denny", Position.PSYCHIATRIST));
        doctors.add(new Doctor("Don", "Dervin", Position.THERAPIST));

        var rooms=new HashMap<Integer, String>();
        rooms.put(103, "Fill Jacson");
        rooms.put(105, "John Smith");
        rooms.put(106, "Elly Paterson");
        rooms.put(108, "Sam Denny");
        rooms.put(109, "Don Dervin");

        var insurance= new ArrayList<Insurance>();
        insurance.add(Insurance.AETNA);
        insurance.add(Insurance.ALFA);
        insurance.add(Insurance.DELTA);
        insurance.add(Insurance.CIGMA);

        var hospital = new Hospital("RWJ", adress, doctors, rooms,insurance);
        hospital.printInfoHosp();
    }
}
