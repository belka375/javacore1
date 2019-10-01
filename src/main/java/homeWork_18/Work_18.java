package homeWork_18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work_18 {
    public static void main(String[] args) {


        Address address = new Address("111 Queen Rd", "Los Angeles", "CA", 90210);

        var acceptedInsuranses = new ArrayList<InsuranseCompanies>();
        acceptedInsuranses.add(InsuranseCompanies.MEDICAL);
        acceptedInsuranses.add(InsuranseCompanies.HUMANA);
        acceptedInsuranses.add(InsuranseCompanies.CIGNA);
        acceptedInsuranses.add(InsuranseCompanies.HELTHNET);
        acceptedInsuranses.add(InsuranseCompanies.GEICO);


        // - Вывести на печать все кабинеты с номерами и их названиямиж
        var room = new HashMap<Integer, String>();
        room.put(12, "ANESTHESIOLOGISTS");
        room.put(45, "OPHTHALMOLOGISTS");
        room.put(53, "NEUROLOGISTS");
        room.put(64, "SURGEONS");
        room.put(89, "DERMATOLOGISTS");

        System.out.println("Print list of all offices with numbers and names\n");
        room.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


        //- Вывести на печать список врачей и их должности - public void printDoctors();
        var listDoc = new ArrayList<Doctor>();
        listDoc.add(new Doctor("Alex", "Iwobi", Position.ANESTHESIOLOGISTS));
        listDoc.add(new Doctor("Ivan", "Rakitich", Position.OPHTHALMOLOGISTS));
        listDoc.add(new Doctor("Zlatan", "Ibrahimovich", Position.DERMATOLOGISTS));
        listDoc.add(new Doctor("Julio", "Cesar", Position.NEUROLOGISTS));
        listDoc.add(new Doctor("Antonio", "Conte", Position.SURGEONS));


        System.out.println("============================================================================================");
        System.out.println("Print list of doctors and their positions - public void printDoctors();\n");
        listDoc.forEach(x -> System.out.println(x.getName() + " " + x.getLastName() + " (" + x.getPosition() + ")"));
        System.out.println("============================================================================================");

        System.out.println("Print, address and list insurances, accepted by the Hospital - public void printInfo();\n");
        //- Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();

        Hospital h1 = new Hospital("ABC", address, listDoc, room, acceptedInsuranses);
        h1.printInfo();


    }
}
