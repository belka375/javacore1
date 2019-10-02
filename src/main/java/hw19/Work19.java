package hw19;

import hw18.Address;

import java.util.*;

public class Work19 {
    public static void main(String[] args){

        var toshAddress = new Address("1586 Atlantic Ave", "Henry", "TN", 38231);
        var cattle = new HashMap<Cattle,Integer>(Map.of(Cattle.CHICKENS,1500,Cattle.TURKEYS,1000,Cattle.PIGS,1700,Cattle.SHEEP,1200,Cattle.COWS,3100));
        var corn = new AgreeCultural("Corn", 1);
        var wheat = new AgreeCultural("Wheat", 2);
        var soybean = new AgreeCultural("Soybean",3);
        var sorghum = new AgreeCultural("Sorghum", 4);
        ArrayList<AgreeCultural> agreeCulturals = new ArrayList<>(Arrays.asList(corn,wheat,soybean,sorghum));
        var Tosh = new Farm("Tosh Farm", toshAddress, cattle, agreeCulturals);

        Tosh.printInfo();
    }
}
