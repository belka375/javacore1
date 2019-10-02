package homework19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;


    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCultural) {
        this.address = address;
        this.name = name;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;



    }

    public void printInfo() {
        System.out.println("Farm: " + name + ". It's address: ");
        address.printInfo();
        System.out.println("There are: " + cattle + " live on the farm");
        System.out.print("Also there are: ");
        for (AgreeCultural agr:agreeCultural
             ) {agr.printInfo();

        }




        }
    }










