package hw18;


import java.util.ArrayList;
import java.util.HashMap;

public class Work {

        public static void main(String[]args){

            Address address=new Address("Main", "Miami", "Fl", 33160);
            ArrayList<Doctor> doctor = new ArrayList<Doctor>();
            HashMap<Integer, String> rooms = new HashMap<Integer, String>();
            ArrayList<InsuaranceCompanies> insuarance = new ArrayList<>();
            Hospital hospital = new Hospital("Jackson", address, doctor, rooms, insuarance);


            address.printAddress();

            doctor.add(new Doctor("Ivan", "Ivanov", Position.DENTIST));
            doctor.add(new Doctor("John", "Loard", Position.PEDIATRIC));
            doctor.add(new Doctor("Peter", "Winter", Position.PHISICIAN));


            rooms.put(22, "Doctor");
            rooms.put(234, "Pediatric");
            rooms.put(432, "Dentist");

            insuarance.add(InsuaranceCompanies.OBAMACARE);
            insuarance.add(InsuaranceCompanies.UNITEDHEALHCARE);
            insuarance.add(InsuaranceCompanies.BLUECROSS);


            hospital.printHospitalInfo();



        }}








