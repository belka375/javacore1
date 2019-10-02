package homeWork19;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork19 {
    public static void main(String[] args) {

        Address address = new Address(122, "Harrison ave.", "Hasbrouck Heights", "New Jersey", 07604);

        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 1500);
        cattle.put(Cattle.COWS, 512);
        cattle.put(Cattle.PIGS, 360);
        cattle.put(Cattle.SHEEPS, 700);
        cattle.put(Cattle.TURKEYS, 870);

        var agreeCultural = new ArrayList<>();
        agreeCultural.add(0, "Canola");
        agreeCultural.add(1, "Flax");
        agreeCultural.add(2,"Jojoba");
        agreeCultural.add(3,"Safflower");
        agreeCultural.add(4,"Sunflowers");
        agreeCultural.add(5, "Sesame");
        agreeCultural.add(6, "Milkweed");
        agreeCultural.add(7, "Lupine");

       var myFarm = new Farm("Urban Agriculture corporation", address, cattle, agreeCultural);

       myFarm.printInfo();




    }
}
