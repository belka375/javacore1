package hw18yp;

import java.util.ArrayList;
import java.util.HashMap;

public class Work18 {
    public static void main (String[]args){

        Doctor alex = new Doctor("Alex","Beckham", Position.CARDIOLOGIST );
        Doctor tom = new Doctor("Tom", "Joyner",Position.DERMATOLOGIST);
        Doctor randy = new Doctor("Randy","Roosekrans", Position.PHYSICIAN);
        Doctor lilly = new Doctor("Lillian", "Koricky", Position.OBSTETRICIAN);
        Doctor val = new Doctor("Valery", "Kolpakov", Position.PEDIATRICIAN);

        Address office1 = new Address("Peachtree rd", "Atlanta", "GA", 30318);
        Address office2 = new Address("Main str.", "Decatur", "GA", 30067);
        Address office3 = new Address("Collier rd", "Houston", "TX", 20056);
        Address office4 = new Address("Federal dr", "Chicago", "IL", 10056);
        Address office5 = new Address("Townpark dr", "Kennesaw", "PA", 30023);

        HashMap<Integer, String> room = new HashMap<Integer, String>();
        room.put(11,"gastroenterology");
        room.put(15,"dermatology test");
        room.put(44,"physical therapy");
        room.put(52,"cardio therapy");


        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(lilly);
        doctors.add(alex);
        doctors.add(tom);
        doctors.add(randy);
        doctors.add(val);

        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.BLUECROSS);
        acceptedInsurances.add(InsuranceCompanies.KAISER);

        Hospital emory = new Hospital("Emory Hospital",office1,doctors,room,acceptedInsurances);

//        1. Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//       2. Вывести на печать список врачей и их должности - public void printDoctors();
//       3. Вывести на печать все кабинеты с номерами и их названиями

        emory.printInfo();
        emory.printDoctors();
        emory.printRooms();

        }
    }
