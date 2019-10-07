package hw19;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {

    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<AgreeCulture> agreeCultures;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCulture> agreeCultures) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultures = agreeCultures;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println("*******************");
        address.printAddress();
        System.out.println("Cattle: ");
        cattle.forEach((cattle, integer) -> System.out.println(cattle));
        System.out.println("Agreeculture and field number: ");
        agreeCultures.forEach(agreeCulture -> agreeCulture.printAgreeCultureInfo());
    }

}
