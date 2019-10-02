package hw18;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.List;

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


=======

public class Work {
    public static void main(String[] args) {

        Address adr = new Address("11111 Telfair ave", "Sylmar", "CA", 91222);
        Doctor doc1 = new Doctor ("James", "Kean", Position.PHYSICIAN);
        Doctor doc2 = new Doctor ("Jane", "Johns", Position.DERMATOLOGIST);
        Doctor doc3 = new Doctor ("Tom", "Spears", Position.PEDIATRICIAN);
        Doctor doc4 = new Doctor("Iris", "Gibbs", Position.OPHTALMOLOGIST);
        Doctor doc5 = new Doctor ("Kate", "Nates", Position.NEUROLOGIST);

        ArrayList<Doctor> docs = new ArrayList<Doctor> ();
        docs.add(0, doc1);
        docs.add(1, doc2);
        docs.add(2, doc3);
        docs.add(3, doc4);
        docs.add(4, doc5);

        HashMap<Integer, String> docRooms = new HashMap<Integer, String> ();
        docRooms.put(54, "dermatology");
        docRooms.put(120, "neurology");
        docRooms.put(3, "ophtalmology");
        docRooms.put(23, "pediatrics");

        ArrayList<InsuranceCompanies> acceptedInsurance = new   ArrayList<InsuranceCompanies> ();
        acceptedInsurance.add(0, InsuranceCompanies.AETNA);
        acceptedInsurance.add(1, InsuranceCompanies.BLUECROSS);
        acceptedInsurance.add(2, InsuranceCompanies.HEALTHNET);
        acceptedInsurance.add(3, InsuranceCompanies.LACARE);

        Hospital GenHospital = new Hospital ("General Hospital", adr, docs, docRooms, acceptedInsurance);


        GenHospital.printInfo();
        doc2.printDoctor();
        GenHospital.printDoctorRoom();
>>>>>>> origin/AA81
    }
}
