package HW19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        Address address = new Address ("3245 Oak str", "Thousand Oaks", "California", 91777);

        HashMap<Cattle, Integer> cattle = new HashMap<Cattle, Integer> ();

        cattle.put(Cattle.COWS, 25);
        cattle.put(Cattle.GOATS, 10);
        cattle.put(Cattle.HORSES, 1);
        cattle.put(Cattle.PIGS, 4);
        cattle.put(Cattle.SHEEP, 5);

        Agriculture culture1 = new Agriculture("Wheats", 1);
        Agriculture culture2 = new Agriculture("Rye", 3);
        Agriculture culture3 = new Agriculture("Oats", 17);

        ArrayList<Agriculture> agriculture = new ArrayList<Agriculture>();


        agriculture.add(0, culture1);
        agriculture.add(1, culture2);
        agriculture.add(2, culture3);

        Farm oldMcDonald = new Farm ("OldMacDonald", address, cattle, agriculture);

        oldMcDonald.printInfo();

    }
}
