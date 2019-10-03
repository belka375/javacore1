package hw19;

import hw18.Address;

import java.util.ArrayList;
import java.util.HashMap;

public class Work19 {
    public static void main(String[] args) {

        var address1 = new Address("3348 8th Avenue", "Tarzana", "MA", 89112);

        var cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.COWS, 12);
        cattle.put(Cattle.SHEEPS, 35);
        cattle.put(Cattle.PIGS, 100);
        cattle.put(Cattle.TURKEYS, 300);
        cattle.put(Cattle.CHICKENS, 1500);

        var agriCultural = new ArrayList<AgriCultural>();
        agriCultural.add(new AgriCultural("Potato", 2));
        agriCultural.add(new AgriCultural("Tomato", 4));
        agriCultural.add(new AgriCultural("Eggplant", 9));
        agriCultural.add(new AgriCultural("Carrot", 10));
        agriCultural.add(new AgriCultural("Onion", 13));

        var farm = new Farm("Barkley Farm", address1, cattle, agriCultural);
        farm.printInfo();

    }
}
