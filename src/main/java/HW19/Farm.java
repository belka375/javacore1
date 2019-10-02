
package HW19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    ArrayList<Agriculture> agriculture;


    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<Agriculture> agriculture) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriculture = agriculture;

    }

    public void printInfo() {
        System.out.println("Farm's name is " + name);
    address.printAddress();

    agriculture.forEach(agriculture -> System.out.println(agriculture));


    cattle.forEach((key, value) -> {System.out.println("Cattle " + key + " number of animals " + value);
    });
    }
}