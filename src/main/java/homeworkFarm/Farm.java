package homeworkFarm;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm implements PrintInfo{
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<AgreeCultural> agreeCulturals;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCulturals) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCulturals = agreeCulturals;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public ArrayList<AgreeCultural> getAgreeCulturals() {
        return agreeCulturals;
    }

    public void setAgreeCulturals(ArrayList<AgreeCultural> agreeCulturals) {
        this.agreeCulturals = agreeCulturals;
    }

    @Override
    public void PrintInfo() {
        System.out.println(name);
        address.PrintInfo();
        cattle.forEach((cattle, integer) -> {
            System.out.println(cattle +": "+integer);
        });
        agreeCulturals.forEach(agreeCultural -> {
            agreeCultural.PrintInfo();
        });
    }
}
