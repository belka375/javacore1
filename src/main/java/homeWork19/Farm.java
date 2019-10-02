package homeWork19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<Object> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<Object> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Object> getAgreeCultural() {
        return agreeCultural;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void printInfo() {
        System.out.println("*********************************************");
        System.out.println("My Farm's name is: " + name);
        address.printInfo();

        System.out.println("**********************************************");

        System.out.println("There are a lot of animals, we have: ");
        System.out.println("**********************************************");

        cattle.forEach((Cattle, Integer) -> System.out.println(Cattle + " => " + Integer+" count!;"));
        System.out.println("***********************************************");
        System.out.println("My Agriculture are: ");
        agreeCultural.forEach(i -> System.out.println(i));
    }
}
