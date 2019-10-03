package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgraCulture> agraCulture;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgraCulture> agraCulture) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agraCulture = agraCulture;
    }
    public void printInfo(){
        System.out.println("Farm:"+name);
        address.printInfo();
        agraCulture.forEach(culture ->culture.printInfo());
        cattle.forEach((Cattle,Integer)-> System.out.println(Cattle+"-"+Integer));
    }
}
