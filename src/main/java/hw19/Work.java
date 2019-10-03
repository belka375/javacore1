package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {
        var agraCulture= new ArrayList<AgraCulture>();
        agraCulture.add(new AgraCulture("Potato",58,"Autumn"));
        agraCulture.add(new AgraCulture("Cabbage",81,"Summer"));
        agraCulture.add(new AgraCulture("Apple",185,"Spring"));
        agraCulture.add(new AgraCulture("Melon",520,"Summer/Autumn"));
        var agraCulture1=new ArrayList<AgraCulture>();
        agraCulture1.add(new AgraCulture("Onion",550,"winter"));
        agraCulture1.add(new AgraCulture("Watermelon",1030,"Summer/Autumn"));
        agraCulture1.add(new AgraCulture("Peach",120,"Spring"));
        var cattle=new HashMap<Cattle,Integer>();
        cattle.put(Cattle.TURKEYS,158);
        cattle.put(Cattle.BISONS,100);
        cattle.put(Cattle.COWS,85);
        cattle.put(Cattle.DUCKS,65);
        cattle.put(Cattle.LAMAS,50);
        var cattle1=new HashMap<Cattle,Integer>();
        cattle1.put(Cattle.SHEEPS,100);
        cattle1.put(Cattle.CHICKENS,150);
        cattle1.put(Cattle.PIGS,50);
        var address=new Address("256 Sadovaya street","Koktem","New York",12345);
        var address1=new Address("1212 Medina street","Yakima","Washington",97118);
        var farm=new Farm("Family Paradise",address,cattle,agraCulture);
        farm.printInfo();
        var farm1=new Farm("Fresh Yammi",address1,cattle1,agraCulture1);
        farm1.printInfo();


    }
}
