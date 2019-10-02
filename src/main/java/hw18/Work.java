package hw18;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args){

        var address = new Address ("Barranca str","Milford", "CA",92604);
        var doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Pater","Shatz", Position.DOCTOR));
        doctors.add(new Doctor("Marya","Toma", Position.DOCTOR));
        doctors.add(new Doctor("Karl","Shutz", Position.DOCTOR));
        doctors.add(new Doctor("Par","Chotz", Position.MANAGER));
        doctors.add(new Doctor("Pak","Sz", Position.NURSE));

        var rooms = new HashMap<Integer,String>();
        rooms.put(12,"Doctor room");
        rooms.put(13,"Doctor room");
        rooms.put(14,"Doctor room");
        rooms.put(15,"Doctor room");
        rooms.put(16,"Doctor room");
        rooms.put(17,"Ultrasond room");
        rooms.put(18,"Registration room");
        rooms.put(19,"Accounter room");

        var acceptedIns=new ArrayList<InsuranseCompanies>();
        acceptedIns.add(InsuranseCompanies.AETNA);
        acceptedIns.add(InsuranseCompanies.Blue_Cros);
        acceptedIns.add(InsuranseCompanies.EMBLEM);
        acceptedIns.add(InsuranseCompanies.UHC);

        var hospital = new Hospital("Mount Zero",address,doctors,rooms,acceptedIns);
        hospital.printInfo();







//        Address ad1=new Address("Barranca str","Milford", "CA",92604);
//        ArrayList<Doctor> dr1 = new ArrayList<>();
//        dr1.add(new Doctor("Maria","Lovarro", Position.DERMATOLOG));
//        dr1.add(new Doctor("Ivan","Petrov",Position.GENERALIST));
//        dr1.add(new Doctor("Karyl","Sun", Position.OFTALMOLOG));
//        dr1.add(new Doctor("Perry","Crownel", Position.PHISICIAN));
//        dr1.add(new Doctor("Katy","Pirsman", Position.OTOLAGINGOLOG));
//
//        ArrayList<InsuranseCompanies> ins=new ArrayList<>();
//        ins.add(0,InsuranseCompanies.AETNA);
//        ins.add(1,InsuranseCompanies.Blue_Cros);
//        ins.add(2,InsuranseCompanies.COBRA);
//        ins.add(3,InsuranseCompanies.NGA);
//
//        Hospital hp1=new Hospital("Kaiser Permanent", ad1, dr1, ins);
//        hp1.printInfo();
//
//
//
//
//        Map<String, String> numAndNameOfOffice=new HashMap<>();
//
//        numAndNameOfOffice.put("1","Dermatology");
//        numAndNameOfOffice.put("2","Phisiciology");
//        numAndNameOfOffice.put("3","Oftalmology");
//        numAndNameOfOffice.put("4","Otolaringology");
//        numAndNameOfOffice.put("5","Terapeut");
//
//        numAndNameOfOffice.forEach((key,value)->{
//            System.out.println("Number of Office: "+key+",name: "+value);
//        });
//
    }
}
