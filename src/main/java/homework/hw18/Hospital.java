package homework.hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String name, Address address, ArrayList<Doctor> doctors, HashMap<Integer,String> rooms,ArrayList<InsuranceCompanies> insurances){
        this.hospitalName=name;
        this.address=address;
        this.doctors=doctors;
        this.rooms=rooms;
        this.acceptedInsurances=insurances;
    }


    public void printInfo(){
        System.out.println("hospital: "+hospitalName);
        address.printInfo();
        doctors.forEach(doctor -> doctor.printInfo());
        rooms.forEach((number,roomName)->System.out.println(number+"  "+roomName));
        System.out.print("accepted insurances: ");
        acceptedInsurances.forEach(i -> System.out.print(i +"   "));

    }
}
