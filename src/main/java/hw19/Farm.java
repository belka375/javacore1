package hw19;

import hw18.Address;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> argeeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = argeeCultural;
    }

    public void printInfo(){
        System.out.println("Farm name : " + name);

        address.prinInfo();
        System.out.println("List of cattles:");

        cattle.forEach((ctl, num) -> System.out.println(ctl + "-->" + num));

        System.out.println("List of fiels :");
        agreeCultural.forEach(cult -> cult.printInfo());

    }
}
