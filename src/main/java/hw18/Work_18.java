package hw18;


import java.util.ArrayList;
import java.util.HashMap;

public class Work_18 {
    public static void main(String[] args) {
        Address addHosp = new Address("12311 Walnut Str.", "Los Angeles", "CA", 90009);
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Ivan", "Petrov", Position.CARDIOLOGIST));
        doctors.add(new Doctor("John", "Smith", Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("Smit", "Sting", Position.ALLERGIST));
        doctors.add(new Doctor("Paola", "Anderson",Position.PHYSICIAN));
        doctors.add(new Doctor("Helen", "Sting",Position.OPHTHALMOLOGIST));

       var insuranceCom = new ArrayList<InsuranceCompanies>();
       insuranceCom.add(InsuranceCompanies.AFLAC);
       insuranceCom.add(InsuranceCompanies.AETNA);
       insuranceCom.add(InsuranceCompanies.VANISA);

       var rooms = new HashMap<Integer, String>();
       rooms.put(1, "Registration");
       rooms.put(2, "Dr. Petrov's room");
       rooms.put(4, "Dr. Smith's room");
       rooms.put(5, "Dr. Anderson's room");
       rooms.put(6, "Dr. Sting's room");
       rooms.put(11, "Dr. Smith's room");
       rooms.put(15, "Laboratory");
       rooms.put(23, "Massage");

       var hospital = new Hospital("Main Hospital", addHosp, doctors, rooms, insuranceCom );

       hospital.printInfo();

        }
    }
