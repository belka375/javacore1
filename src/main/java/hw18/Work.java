package hw18;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        Address hospitalAddress = new Address("2734 El Camino Real", "Santa Clara", "CA", 95050);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Chase", "Radd", Position.PHYSICIAN));
        doctors.add(new Doctor("Ken", "Xu", Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("Dino", "Lamdox", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Bram", "Dougen", Position.SURGEON));
        doctors.add(new Doctor("Emily", "Lim", Position.PEDIATRICIAN));

        HashMap<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(10, "Gastroenterology");
        rooms.put(15, "Delivery room");
        rooms.put(12, "Nursery");
        rooms.put(18, "Surgery");
        rooms.put(25, "Emergency");

        ArrayList<InsuranceCompanies> listAcceptedInsurances = new ArrayList<InsuranceCompanies>();
        listAcceptedInsurances.add(InsuranceCompanies.KAISER_PERMANENTE);
        listAcceptedInsurances.add(InsuranceCompanies.HCSC);
        listAcceptedInsurances.add(InsuranceCompanies.AETNA);

        Hospital santaClaraCenter = new Hospital("Santa Clara Center", hospitalAddress, doctors, rooms, listAcceptedInsurances);

        //print Hospital info
        santaClaraCenter.printInfo();


//        //print rooms using lambda expression
//        rooms.forEach((key, value) -> {
//            System.out.println("Number = " + key + ", Name = " + value);
//        });

    }

}
