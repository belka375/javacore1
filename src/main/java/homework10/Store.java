package homework10;

import com.sun.source.tree.UsesTree;

public class Store {
    private String name;
    private int numberOfEmployees;
    private boolean isProfited;

    public void storeInfo () {
        System.out.println(name+" "+ numberOfEmployees+" "+isProfited );
        if (isProfited == false) {
            System.out.println("Store \'" +name+ "\' should be closed");
        }
    }

    public Store (String storeName, int employees,boolean profit) {
        this.name = storeName;
        this.numberOfEmployees = employees;
        this.isProfited = profit;
    }
    public Store () {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setProfited(boolean profited) {
        isProfited = profited;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

}
