package homework19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        var address= new Address ("5726 N. 75th Ave", "Glendale", "AZ",85303);

        var cattle=new HashMap<Cattle,Integer>();
        cattle.put(Cattle.COWS,30);
        cattle.put(Cattle.CHICKENS,45);
        cattle.put(Cattle.PIGS,35);
        cattle.put(Cattle.SHEEPS,50);
        cattle.put(Cattle.TURKEYS,20);

        var agriCulture=new ArrayList<AgriCulture>();
        agriCulture.add(new AgriCulture ("Oxez",12));
        agriCulture.add(new AgriCulture("3LiLPigs",15));
        agriCulture.add(new AgriCulture("Yardecue",27));
        agriCulture.add(new AgriCulture("SpiceBooth",64));

        var farm = new Farm ("Tolmachoff",address,cattle,agriCulture);
        farm.printInfo();

    }

}
