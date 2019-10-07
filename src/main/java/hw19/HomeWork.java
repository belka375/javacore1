package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork {

    public static void main(String[] args) {

        var Address = new Address(123, "New Hampshire ave", "Ventura", "CA", 90002);

        var cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.CHICKENS, 100);
        cattle.put(Cattle.COWS, 20);
        cattle.put(Cattle.PIGS, 35);
        cattle.put(Cattle.SHEEPS, 33);
        cattle.put(Cattle.TURKEYS, 55);

        var agreeCulture = new ArrayList<AgreeCulture>();
        agreeCulture.add(new AgreeCulture("Corn", 3));
        agreeCulture.add(new AgreeCulture("Wheat", 1));
        agreeCulture.add(new AgreeCulture("Cucumber", 15));
        agreeCulture.add(new AgreeCulture("Cabbage", 2));
        agreeCulture.add(new AgreeCulture("Tomato", 7));
        agreeCulture.add(new AgreeCulture("Squash", 9));

        Farm johnsFarm = new Farm("John`s Farm", Address, cattle, agreeCulture );

        johnsFarm.printInfo();
    }



}
