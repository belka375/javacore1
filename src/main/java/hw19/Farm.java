package hw19;

import hw18.Address;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
        private String name;
        private Address address;
        private HashMap<Cattle,Integer> cattle;
        private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public ArrayList<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void printInfo(){
     System.out.println(name);
     address.getAddressInfo();
     cattle.forEach((key,value)-> System.out.println(key+", "+value));
        for (AgreeCultural aGC:agreeCultural) {
            aGC.getACinfo();
        }
 }
}
