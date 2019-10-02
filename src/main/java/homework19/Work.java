package homework19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        Address adr = new Address("45 Millenia", "Orlando", "FL", 32839);
        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 3);
        cattle.put(Cattle.COWS, 10);
        cattle.put(Cattle.PIGS, 18);
        cattle.put(Cattle.SHEEPS, 20);
        cattle.put(Cattle.TURKEYS, 45);


        ArrayList<AgreeCultural> agr = new ArrayList<>();
        agr.add(new AgreeCultural("potatoes", 2));
        agr.add(new AgreeCultural("onions", 3));
        agr.add((new AgreeCultural("carrots", 9)));




        Farm farm = new Farm("Romashka", adr, (HashMap<Cattle, Integer>) cattle, agr);
        farm.printInfo();


    }
}
