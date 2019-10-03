package hw18;



import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        var address=new Address("2020 Madison avenue","Brooklyn","New York",11203);
        var address1=new Address("2369 Sting street","Portland","Oregon",97118);
        var doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor("James","London",Position.CARDIOLOGIST));
        doctors.add(new Doctor("Lana","Dovin",Position.DERMATOLOGIST));
        doctors.add(new Doctor("Damon","Salvatore",Position.DENTIST));
        doctors.add(new Doctor("Mikael","Gilbert",Position.GASTROENTEROLOGIST));
        doctors.add(new Doctor("Andy","Garsia",Position.MIDWIFE));
        doctors.add(new Doctor("Amanda","Klaus",Position.NEUROLOGIST));
        doctors.add(new Doctor("Samuel","Winchester",Position.PSYCHOTHERAPIST));
        doctors.add(new Doctor("Daniel","Roerig",Position.NURSE));
        doctors.add(new Doctor("Kol","Grand",Position.SURGEON));
        doctors.add(new Doctor("Rebecca","Mikaelson",Position.ORTHODONTIST));
        doctors.add(new Doctor("Richard","Darovski",Position.OPHTHALMOLOGIST));
        var doctors1=new ArrayList<Doctor>();
        doctors1.add(new Doctor("Joana","Lime",Position.CARDIOLOGIST));
        doctors1.add(new Doctor("Lana","Kroul",Position.DERMATOLOGIST));
        doctors1.add(new Doctor("David","Kornov",Position.DENTIST));
        doctors1.add(new Doctor("Davina","Ester",Position.GASTROENTEROLOGIST));
        doctors1.add(new Doctor("Arman","Karev",Position.MIDWIFE));
        doctors1.add(new Doctor("Mer","Grey",Position.NEUROLOGIST));
        doctors1.add(new Doctor("Inna","Yakovski",Position.PSYCHOTHERAPIST));
        var acceptedInsurance=new ArrayList<InsuranceCompanies>();
        acceptedInsurance.add(InsuranceCompanies.APPLE);
        acceptedInsurance.add(InsuranceCompanies.BLUE_CROSS);
        acceptedInsurance.add(InsuranceCompanies.BLUE_SHIELD);
        acceptedInsurance.add(InsuranceCompanies.KAISER);
        acceptedInsurance.add(InsuranceCompanies.MOLINA);
        var rooms=new HashMap<Integer,String>();
        rooms.put(213,"Exam room");
        rooms.put(415,"X-Ray room");
        rooms.put(619,"Operating room");
        rooms.put(714,"First aid");
        rooms.put(118,"NICU");
        rooms.put(816,"ICU");
        rooms.put(101,"On-Call room");
        var rooms1=new HashMap<Integer,String>();
        rooms1.put(312,"Exam room");
        rooms1.put(311,"X-Ray room");
        rooms1.put(711,"Operating room");
        rooms1.put(512,"First aid");
        rooms1.put(111,"NICU");
        rooms1.put(611,"ICU");
        var hospital=new Hospital("Mount Sinai",address,doctors,rooms,acceptedInsurance);
        var hospital1=new Hospital("Coney Island",address1,doctors1,rooms1,acceptedInsurance);


        hospital.printInfo();
        hospital1.printInfo();


    }
}
