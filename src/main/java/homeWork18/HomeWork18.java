package homeWork18;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork18 {
    public static void main(String[] args) {

        Address address = new Address("122 Harrison ave.", "Hasbrouck Heights", "New Jersey", 07700);

        var doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Olga", "Chen", Position.DENTAL, 22,"PHYSICIAN" ));
        doctors.add(new Doctor("Max", "Vasiliev", Position.DIAGNOSTIC,23, "THERAPIST"));
        doctors.add(new Doctor("Sara", "Main", Position.PHYSICIAN,24, "PHARMACIST"));
        doctors.add(new Doctor("Tatyana", "Kotova", Position.EMERGENCY,25, "DIAGNOSTIC"));
        doctors.add(new Doctor("Mark", "Fitzpatrik", Position.PHARMACIST,26, "DENTAL"));
        doctors.add(new Doctor("John", "Holms", Position.RESPIRATORY,27, "EMERGENCY"));
        doctors.add(new Doctor("Phill", "Artuzo", Position.NURSE,28,"RESPIRATORY"));
        doctors.add(new Doctor("Tereza", "Doroty", Position.THERAPIST,29, "NURSE"));


        var insurances = new ArrayList<Insurance>();
        insurances.add(Insurance.AETNA);
        insurances.add(Insurance.CIGNA);
        insurances.add(Insurance.HCSC);
        insurances.add(Insurance.KAISER);
        insurances.add(Insurance.UNAITEDHEALTH);
        insurances.add(Insurance.HUMANA);

        var hospital = new Hospital("Charls Crossing hospital", address, insurances, doctors);
        hospital.printInfo();












    }
}
