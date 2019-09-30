package workHw18;
/*
 * Homework 18
 *Create class Hospital
 *Attributes:private String hospitalName;
 *private Address address;
 *(Class Address
 *private String streetAddress;
 *private String town;
 *private String state;
 *private int zip;
 *private ArrayList<Doctor> doctors;
 *(Class Doctor
 *private String name;
 *private String lastName;
 *private Position position;
 *(Enum Position is a enum with 5 members - for example Position.PHYSICIAN);
 *private HashMap<Integer,String> rooms; (list of offices and their names - for example office 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
 *private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurances.
 *(Enum InsuranseCompamies - enum of Insuranses, for example InsuranseCompamies, AETNA, InsuranseCompamies.UnitedHealthcare)
 *Methods:
 *Print, address and list insurances, accepted by the Hospital - public void printInfo();
 *Print list of doctors and their positions - public void printDoctors();
 *Print list of all offices with numbers and names

 */

import java.util.*;

public class Work {
    public static void main(String[] args) {

        Address address1 = new Address("123 Main Street", "Los Angeles", "CA", 90023);
       // Address address2 = new Address("2021 Santa Monica Blvd", "Santa Monica", "CA", 90404);


        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Peter", "Grey", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Ellen", "MgGrath", Position.DERMATOLOGIST));
        doctors.add(new Doctor("Phill", "Wood", Position.IMMUNOLOGIST));
        doctors.add(new Doctor("Anna", "Wong", Position.DENTIST));
        doctors.add(new Doctor("Robert", "Killroy", Position.PSYCHIATRIST));

        ArrayList<InsuranceCompanies>listAcceptedInsurances = new ArrayList<InsuranceCompanies>();
        listAcceptedInsurances.add(InsuranceCompanies.AETNA);
        listAcceptedInsurances.add(InsuranceCompanies.CIGNA);
        listAcceptedInsurances.add(InsuranceCompanies.HUMANA);

        HashMap<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(2, "ER");
        rooms.put(15, "Surgery");
        rooms.put(30, "Laboratory");
        rooms.put(3,"Physical Therapy");
        rooms.put(40,"Dentist");

        Hospital hospital1 = new Hospital("Children Hospital", address1,doctors,listAcceptedInsurances);

        //print doctors
         hospital1.printDoctors();

        System.out.println("_____________________________________________");
         //print rooms
        System.out.println("Rooms");
        for (Map.Entry<Integer, String> pair : rooms.entrySet()){
            System.out.println("Room Number:" + pair.getKey() + ",Name: " + pair.getValue());
        }

        System.out.println("_____________________________________________");

        //hospital print info
        hospital1.printInfo();

        }


    }





