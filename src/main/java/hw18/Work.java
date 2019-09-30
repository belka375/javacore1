package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args){



        Address ad1=new Address("Barranca str","Milford", "CA",92604);
        ArrayList<Doctor> dr1 = new ArrayList<>();
        dr1.add(new Doctor("Maria","Lovarro", Position.DERMATOLOG));
        dr1.add(new Doctor("Ivan","Petrov",Position.GENERALIST));
        dr1.add(new Doctor("Karyl","Sun", Position.OFTALMOLOG));
        dr1.add(new Doctor("Perry","Crownel", Position.PHISICIAN));
        dr1.add(new Doctor("Katy","Pirsman", Position.OTOLAGINGOLOG));

        ArrayList<InsuranseCompanies> ins=new ArrayList<>();
        ins.add(0,InsuranseCompanies.AETNA);
        ins.add(1,InsuranseCompanies.Blue_Cros);
        ins.add(2,InsuranseCompanies.COBRA);
        ins.add(3,InsuranseCompanies.NGA);

        Hospital hp1=new Hospital("Kaiser Permanent", ad1, dr1, numAndNameOfOffice, ins);
        hp1.getAddress();
        hp1.getDoctors();
        Map<String, String> numAndNameOfOffice=new HashMap<>();

        numAndNameOfOffice.put("1","Dermatology");
        numAndNameOfOffice.put("2","Phisiciology");
        numAndNameOfOffice.put("3","Oftalmology");
        numAndNameOfOffice.put("4","Otolaringology");
        numAndNameOfOffice.put("5","Terapeut");

        numAndNameOfOffice.forEach((key,value)->{
            System.out.println("Number of Office: "+key+",name: "+value);
        });

    }
}
