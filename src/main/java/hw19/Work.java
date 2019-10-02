package hw19;

import hw18.Address;
import hw18.InsuranseCompanies;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args){
        var address = new Address("Maccorny ave", "Terracorta","CA", 92600);

        var cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.CHIKENS,600);
        cattle.put(Cattle.COWS,200);
        cattle.put(Cattle.PIGS,800);
        cattle.put(Cattle.SHEEPS,1000);
        cattle.put(Cattle.TURKEYS,100);

        var agreeCult=new ArrayList<AgreeCultural>();
        agreeCult.add(new AgreeCultural("Corn", 3));
        agreeCult.add(new AgreeCultural("Lavand",25));
        agreeCult.add(new AgreeCultural("Wheat",45));
        agreeCult.add(new AgreeCultural("X-Ray Carrot",124));
        agreeCult.add(new AgreeCultural("Water melon",5));



        var ferm=new Farm("Tarro",address,cattle,agreeCult);
        ferm.printInfo();


    }
}
