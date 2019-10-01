package hw18;

import java.util.ArrayList;
import java.util.HashMap;

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
    }
}
