package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork {

    public static void main(String[] args) {

        var address = new Address("100 Olive street", "Burbank", "CA", 91000);
        var doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Ivan", "Petrov", Position.PHYSICIAN));
        doctors.add(new Doctor("Rose", "Simpson", Position.PEDIATRICIAN));
        doctors.add(new Doctor("Paul", "Smith", Position.GASTROENTEROLOGIST));
        doctors.add(new Doctor("Vlad", "Ivanov", Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("Sam", "Gomer", Position.TRAUMATOLOGIST));
        doctors.add(new Doctor("Leticia", "Brown", Position.SURGEON));

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(10," Physician");
        rooms.put(115," Pediatrician");
        rooms.put(204," Gastroenterologist");
        rooms.put(315," Traumatologist");
        rooms.put(100," Surgeon");
        rooms.put(213," Anesthesiologist");

        var acceptedInsurances = new ArrayList<InsuranceCompanies>();
        acceptedInsurances.add(InsuranceCompanies.LA_CARE);
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.ANTHEM_BLUE_CROSS);
        acceptedInsurances.add(InsuranceCompanies.BLUE_SHIELD);
        acceptedInsurances.add(InsuranceCompanies.KAISER);





        Hospital providence = new Hospital("Providence", address, doctors, rooms,  acceptedInsurances);

        providence.printInfo();
    }

}
