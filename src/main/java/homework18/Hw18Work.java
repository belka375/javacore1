package homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw18Work {
    public static void main(String[] args) {
        Address shatterAddress = new Address("3060 Latham street","Mountain View", "CA", 95690);

        Doctor johnson = new Doctor("John", "Johnson",Position.CARDIOLOGYST);
        Doctor moor = new Doctor("Julia", "Moor", Position.PEDIATRIST);
        Doctor lermann = new Doctor("Michel", "Lermann",Position.DENTIST);
        Doctor ivanov = new Doctor("Sergey","Ivanov", Position.OTOLARYNGOLOGIST);
        List<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(0,johnson);
        doctors.add(1,ivanov);
        doctors.add(2,moor);
        doctors.add(3,lermann);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Cardeology");
        rooms.put(20, "Surgery");
        rooms.put(30, "Otolaringology");

        List<InsuranceCompanies> acceptedInsuranses = new ArrayList<InsuranceCompanies>();
        acceptedInsuranses.add(0,InsuranceCompanies.AETNA);
        acceptedInsuranses.add(1,InsuranceCompanies.UNITEDHEALTHCARE);


        Hospital shutterHealth = new Hospital("Shutter Health", shatterAddress,doctors,rooms,acceptedInsuranses);
        shutterHealth.printInfo();


    }
}
