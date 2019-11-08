package homeWork19;

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
    public void printFarm(){
        System.out.println("Welcome to "+ name);
        address.printAdInfo();
        cattle.forEach((cattle1, value)->System.out.println (cattle1+" = "+ value));
        agreeCultural.forEach(cultural-> cultural.printAgreeCultural());

    }
}
