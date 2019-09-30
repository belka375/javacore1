package hw18byTanik;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;

public class Work18 {
    public static void main(String[] args) {

    Doctor drIvanov = new Doctor("Peter", "Ivanov",Position.DERMATOLOGIST);
    Doctor drPetrov = new Doctor("Ivan", "Petrov", Position.NEUROLOGIST);
    Doctor drSidorov = new Doctor("Bob", "Sidorov", Position.PHYSICIAN);
    Doctor drSmith = new Doctor("Greg", "Smith", Position.PEDIATRICIAN);

    ArrayList<Doctor> hoagDoctors = new ArrayList<Doctor>();
    hoagDoctors.add(0,drIvanov);
    hoagDoctors.add(1, drPetrov);

    ArrayList<Doctor> kaiserDoctors = new ArrayList<Doctor>();
    kaiserDoctors.add(0, drSidorov);
    kaiserDoctors.add(1, drSmith);

    Address hoagAddress = new Address("12 McCarthur blvd", "Newport Beach", "CA", 92626);
    Address kaiserAddress = new Address ("567 Sand Canyon dr", "Irvine", "CA", 92677);

    HashMap<Integer, String> hoagRooms = new HashMap<Integer, String>();
    hoagRooms.put(1, "Dermatology");
    hoagRooms.put(2, "Pediatrics");
    hoagRooms.put(3, "Optometry");
    hoagRooms.put(4, "Family Care");

    HashMap<Integer, String> kaiserRooms = new HashMap<Integer, String>();
    kaiserRooms.put(101, "Family Care");
    kaiserRooms.put(102, "Neurology");
    kaiserRooms.put(103, "Dermatology");

    ArrayList<InsuranceCompanies> hoagIsuarances = new ArrayList<InsuranceCompanies>();
    hoagIsuarances.add(0, InsuranceCompanies.BLUECROSS);
    hoagIsuarances.add(1, InsuranceCompanies.BLUESHIELD);
    hoagIsuarances.add(2, InsuranceCompanies.UNITEDHEALTHCARE);
    hoagIsuarances.add(3, InsuranceCompanies.AETNA);
    ArrayList<InsuranceCompanies> kaiserIsuarances = new ArrayList<InsuranceCompanies>();
    kaiserIsuarances.add(0, InsuranceCompanies.KAISER);


    Hospital hoag = new Hospital("Hoag", hoagAddress, hoagDoctors, hoagRooms, hoagIsuarances);

        System.out.println("----- Hospital 1 -----");

    hoag.printInfo();
    hoag.printDoctors();
    hoag.printRooms();

        Hospital kaiserHospital = new Hospital("Kaiser", kaiserAddress, kaiserDoctors, kaiserRooms, kaiserIsuarances);

        System.out.println("----- Hospital 2 -----");

        kaiserHospital.printInfo();
        kaiserHospital.printDoctors();
        kaiserHospital.printRooms();

    }
}
