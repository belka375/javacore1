package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<String, Integer> rooms;
    private ArrayList<InsuranseCompamies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<String, Integer> rooms, ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    //Вывести на печать название, адрес и список Иншурансов которые принимает больница;
    public void printInfo() {
        System.out.println(hospitalName);
        address.printAddress();
        for (InsuranseCompamies insuranseCompamie: acceptedInsuranses) {
            System.out.println(insuranseCompamie);
        }
    }

    //Вывести на печать список врачей и их должности;
    public void printDoctors() {
        for (Doctor docs: doctors) {
            System.out.println("Doctor's full name: " + docs.getName() + docs.getLastName());
            System.out.println("Doctor's position: " + docs.getPosition());
        }
    }

    //Вывести на печать все кабинеты с номерами и их названиямиж.
    public void printRooms() {
        rooms.forEach((key,value)->{
            System.out.println("Room name = " + key + ", room # = " + value);
        });
    }





}

