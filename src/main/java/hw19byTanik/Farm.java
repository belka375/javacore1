package hw19byTanik;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> numberOfCattles;
    private ArrayList<AgriCultural> agriCulturals;

    public Farm(String name, Address address, HashMap<Cattle, Integer> numberOfCattles, ArrayList<AgriCultural> agriCulturals){
        this.name=name;
        this.address=address;
        this.numberOfCattles=numberOfCattles;
        this.agriCulturals=agriCulturals;
    }

    public void printInfo(){
        System.out.print("Farm Info:\n"+"Name: "+name+"\nAddress: ");
        address.printInfo();
        System.out.println("\nFarm's Cattle:");
        numberOfCattles.forEach((key, value)-> {
            System.out.println("Type: "+key+"; Quantity: "+value+";");
        });
        System.out.println("Farm's agricultures:");
        agriCulturals.forEach( agriCultural -> agriCultural.printInfo());
    }

}
