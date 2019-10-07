package collections;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private String address;
    private List<Branch> branches;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
        branches = new ArrayList<Branch>();
    }

    public void addBranche(Branch branch) {
        branches.add(branch);
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
