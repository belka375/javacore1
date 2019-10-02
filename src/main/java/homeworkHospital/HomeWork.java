package homeworkHospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        Address adr1 = new Address("100 Green St", "Louisville", "KY", 40204);
        Address adr2 = new Address("200 Red St", "Richmond", "KY", 40204);
        Address adr3 = new Address("32 Yellow St", "Chicago", "IL", 54234);

        Doctors dc1 = new Doctors("John", "Doss", Positions.DENTIST);
        Doctors dc2 = new Doctors("Robert", "Wiliams", Positions.NEUROLOGIST);
        Doctors dc3 = new Doctors("Victoria", "Roberts", Positions.PHYSICIAN);
        Doctors dc4 = new Doctors("Alina", "Victor", Positions.ONCOLOGIST);
        Doctors dc5 = new Doctors("Nick", "Offer", Positions.OPHTHALMOLOGISTS);
        Doctors dc6 = new Doctors("Mitchell", "King", Positions.PHYSICIAN);
        Doctors dc7 = new Doctors("Chris", "Pit", Positions.DENTIST);
        Doctors dc8 = new Doctors("Peter", "Unilus", Positions.PHYSICIAN);

        Map<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(22,"Dentist");
        rooms.put(12, "Neurologist");
        rooms.put(45, "Ophthalmology");
        rooms.put(67, "Physician");
        rooms.put(104, "Oncology");

        Map<Integer, String> rooms2 = new HashMap<Integer, String>();
        rooms2.put(1,"Dentist");
        rooms2.put(34, "Neurologist");
        rooms2.put(89, "Ophthalmology");
        rooms2.put(2, "Physician");
        rooms2.put(90, "Oncology");

        Map<Integer, String> rooms3 = new HashMap<Integer, String>();
        rooms3.put(9,"Dentist");
        rooms3.put(6, "Neurologist");
        rooms3.put(39, "Ophthalmology");
        rooms3.put(10, "Physician");
        rooms3.put(109, "Oncology");

        List<Doctors> doc1 = new ArrayList<Doctors>();
        doc1.add(dc1);
        doc1.add(dc2);
        doc1.add(dc3);

        List<Doctors> doc2 = new ArrayList<Doctors>();
        doc2.add(dc4);
        doc2.add(dc5);
        doc2.add(dc6);

        List<Doctors> doc3 = new ArrayList<Doctors>();
        doc3.add(dc7);
        doc3.add(dc8);

        List<InsuranceCompanies> ins1 = new ArrayList<InsuranceCompanies>();
        ins1.add(InsuranceCompanies.AETNA);
        ins1.add(InsuranceCompanies.AMERICANHEALTH);
        ins1.add(InsuranceCompanies.GENERAL);

        List<InsuranceCompanies> ins2 = new ArrayList<InsuranceCompanies>();
        ins2.add(InsuranceCompanies.GENERAL);
        ins2.add(InsuranceCompanies.UNITEDHEALTH);


        List<InsuranceCompanies> ins3 = new ArrayList<InsuranceCompanies>();
        ins3.add(InsuranceCompanies.UNITEDHEALTH);
        ins3.add(InsuranceCompanies.AMERICANHEALTH);
        ins3.add(InsuranceCompanies.AETNA);



        Hospital hosp1 = new Hospital("NewLife", adr1, doc1, rooms, ins1);
        Hospital hosp2 = new Hospital("Baptist Health", adr2, doc2, rooms2, ins2);
        Hospital hosp3 = new Hospital("City General", adr3, doc3, rooms3, ins3);

        hosp1.PrintInfo();
        hosp2.PrintInfo();
        hosp3.PrintInfo();

        










    }
}
