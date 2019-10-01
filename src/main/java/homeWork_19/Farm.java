package homeWork_19;


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
    public void printFarmInfo(){
        System.out.println("Farm name: "+name);
        System.out.println("----------------");
        address.printAddress();
        System.out.println("----------------");
        cattle.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());});
        System.out.println("----------------");
        agreeCultural.forEach(x->x.printAgreeCulturalInfo());
    }
}
