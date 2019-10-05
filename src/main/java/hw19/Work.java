package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args){

    Address address = new Address("12312 Main Str", "Corona","CA", 907658);

    ArrayList<AgriCultural> agriCult = new ArrayList<>();
    agriCult.add(new AgriCultural("Wheat", 5));
    agriCult.add(new AgriCultural("Potatoes", 7));
    agriCult.add(new AgriCultural("Corn", 4));

    var cattle = new HashMap<Cattle,Integer>();
    cattle.put(Cattle.CHICKENS, 70);
    cattle.put(Cattle.PIGS, 40);
    cattle.put(Cattle.COWS, 90);
    cattle.put(Cattle.TURKEYS, 70);
    cattle.put(Cattle.SHEEPS, 55);

    var farm = new Farm("Pedro's ranch", address, cattle, agriCult);
    farm.printInfo();
    }
}