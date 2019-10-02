package workHw19;

import java.util.*;

public class Farm {
    private String name;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<AgriCulture> agriCulture;
    private Address address;

    public Farm(String name, Address address, ArrayList< AgriCulture > agriCulture, HashMap<Cattle, Integer> cattle) {

        this.name = name;
        this.agriCulture = agriCulture;
        this.cattle = cattle;
        this.address = address;
    }

    public void PrintInfo(){
        System.out.println("Farm name:"+name);
        System.out.println("Farm Address:");
        address.printAddress();
        System.out.println("Farm Cattle: ");
        printCattle();
        System.out.println("AgriCulture: ");
        printAgriCulture();
    }

    private void printAgriCulture(){
        agriCulture.forEach(ac->ac.printAgriCulture());
    }


    private void printCattle(){
        cattle.forEach((cattleName,cattleNumber)-> System.out.println("This Cattle is " + cattleName + ", " + cattleNumber));
    }


}









