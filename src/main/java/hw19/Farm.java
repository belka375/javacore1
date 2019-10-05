package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgriCultural> agriCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgriCultural> agriCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultural = agriCultural;
    }

    public void printInfo(){
        System.out.println("\nName: " + name);
        address.printInfo();
        cattle.forEach((cattles,numberOfCattles)-> System.out.println(cattles + ", " + numberOfCattles));
        agriCultural.forEach(item -> item.printInfo());


    }
}
