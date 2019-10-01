package homeWork_19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work_19 {
    public static void main(String[] args) {

        //Address
        Address address = new Address("222 Queen Rd", "Los Angeles", "CA", 90210);

        //AgreeCulturals
        var agreeCulturals = new ArrayList<AgreeCultural>();
        agreeCulturals.add(new AgreeCultural("Corn",20));
        agreeCulturals.add(new AgreeCultural("Sunflower",40));
        agreeCulturals.add(new AgreeCultural("Rice",30));
        agreeCulturals.add(new AgreeCultural("Wheat",25));

        //Cattle

        var cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.PIGS,200);
        cattle.put(Cattle.CHICKENS,2000);
        cattle.put(Cattle.HORSES,300);
        cattle.put(Cattle.SHEEPS,800);
        cattle.put(Cattle.COWS,1000);
        cattle.put(Cattle.TURKEYS,1500);

        //Farm

        var farm = new Farm("Gold Farm",address,cattle,agreeCulturals);
        farm.printFarmInfo();
    }

}
