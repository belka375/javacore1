package homework.hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class WorkHw19 {
    public static void main(String[]args) {
        var address = new Address("5 Oak road", "Oakland", "NY", 10089);

        var cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.COWS, 3);
        cattle.put(Cattle.CHICKENS, 20);
        cattle.put(Cattle.TURKEYS, 15);
        cattle.put(Cattle.SHEEP, 10);
        cattle.put(Cattle.PIGS, 4);

        var crops = new ArrayList<Agricultural>();
        crops.add(new Agricultural("wheat", 2));
        crops.add(new Agricultural("oat", 1));
        crops.add(new Agricultural("grass", 4));

        var farm=new Farm("Joy",address,cattle,crops);
        farm.printInfo();


    }
}
