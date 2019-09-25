package hw15yp;

public class Store implements ProtoStore {
    protected String name;
    protected String location;
    protected int numberOfEmployees;

    public Store(String name, String location, int numberOfEmployees){
        this.name=name;
        this.location=location;
        this.numberOfEmployees=numberOfEmployees;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void printStoreInfo() {
        System.out.println("Store name - " +name+ "\nStore location: "+location+"\nNumber of employees: "+numberOfEmployees);
    }
}
