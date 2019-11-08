package homeWork19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {

    public static void main(String[] args) {

        var address= new Address("77 Notten St", "Humpsher", "MN", 8885616);

        var cattle= new HashMap<Cattle,Integer>();
        cattle.put(Cattle.CHICKENS, 70);
        cattle.put(Cattle.COWS, 300);
        cattle.put(Cattle.PIGS, 200);
        cattle.put(Cattle.SHEEPS, 5576);
        cattle.put(Cattle.TURKEYS, 8664);

        var culture = new ArrayList<AgreeCultural>();
        culture.add(new AgreeCultural("Rice", 17));
        culture.add(new AgreeCultural("Wheat", 68));
        culture.add(new AgreeCultural("Oats", 65));
        culture.add (new AgreeCultural("Corn", 23));
        culture.add(new AgreeCultural("Rye", 54));

        var farm = new Farm("Anna's Organic Farm", address, cattle, culture);
        farm.printFarm();

    }
}
