package hw19;

import hw18.Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Work19 {
    public static void main(String[] args){

        var toshAdress = new Address("1586 Atlantic Ave", "Henry", "TN", 38231);
        var cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.CHICKENS,1500);
        cattle.put(Cattle.TURKEYS,1000);
        cattle.put(Cattle.PIGS,1700);
        cattle.put(Cattle.SHEEP,1200);
        cattle.put(Cattle.COWS,3100);
        var corn = new AgreeCultural("Corn", 1);
        var wheat = new AgreeCultural("Wheat", 2);
        var soybean = new AgreeCultural("Soybean",3);
        var sorghum = new AgreeCultural("Sorghum", 4);
        ArrayList<AgreeCultural> agreeCulturals = new ArrayList<>(Arrays.asList(corn,wheat,soybean,sorghum));
        var Tosh = new Farm("Tosh Farm", toshAdress, cattle, agreeCulturals);

        Tosh.printInfo();
    }
}
