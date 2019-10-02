package homework.hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {

    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<Agricultural> agricultural;


    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
    }

    public void printInfo(){
        System.out.println("farm: "+name);
        address.printInfo();
        System.out.println("AMIMALS");
        cattle.forEach((kind,number)-> System.out.println(kind+": "+number));
        agricultural.forEach(agricultural->agricultural.printInfo());
    }

}
