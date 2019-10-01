package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgriCulture> agriCulture;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgriCulture> agriCulture) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCulture = agriCulture;
    }

    public void printInfo(){
        System.out.println("Farm name: "+name);
        System.out.println("Address:");
        address.printInfo();
        System.out.println("Cattle: ");
        printCattle();
        System.out.println("AgriCulture: ");
        printAgriCulture();

    }
    private void printCattle(){
        cattle.forEach((cattleName,cattleNumber)-> System.out.println(cattleName+": "+cattleNumber));
    }

    private void printAgriCulture(){
        agriCulture.forEach(ac->ac.printInfo());
    }
}
