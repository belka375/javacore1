package hw19yp;


import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private FarmAddress address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<Agricultural> agricultural;

    public Farm(String name, FarmAddress address, HashMap<Cattle, Integer> cattle, ArrayList<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
    }

    public void printInfo(){
        System.out.println("Farm name = "+name);
        address.printInfo();
        cattle.forEach((cattleType, numberOfHeads)-> System.out.println(cattleType+ " -->"+numberOfHeads));
        agricultural.forEach(agricultural->agricultural.printInfo());

    }
}
