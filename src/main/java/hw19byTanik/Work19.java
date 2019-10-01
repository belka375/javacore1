package hw19byTanik;

import java.util.ArrayList;
import java.util.HashMap;


public class Work19 {

    public static void main(String[] args) {

        Address farmAddress = new Address("23 Elton Ave", "Houston", "Texas", 96578);

        AgriCultural weatField = new AgriCultural("Weat", 1);
        AgriCultural barleyField = new AgriCultural("Barley", 2);
        AgriCultural potato = new AgriCultural("Potato", 3);
        AgriCultural rye = new AgriCultural("Rye", 4);

        HashMap<Cattle, Integer> farmCattle = new HashMap<Cattle, Integer>();
        farmCattle.put(Cattle.COWS, 15);
        farmCattle.put(Cattle.HORSES, 5);
        farmCattle.put(Cattle.PIGS, 8);
        farmCattle.put(Cattle.SHEEPS, 12);
        farmCattle.put(Cattle.CHICKENS, 32);
        farmCattle.put(Cattle.TURKEYS, 9);

        ArrayList<AgriCultural> farmCultures = new ArrayList<>();
        farmCultures.add(0, weatField);
        farmCultures.add(1, barleyField);
        farmCultures.add(2, potato);
        farmCultures.add(3, rye);

        Farm farmNew = new Farm("Ferma", farmAddress, farmCattle, farmCultures);

        farmNew.printInfo();
    }
}





