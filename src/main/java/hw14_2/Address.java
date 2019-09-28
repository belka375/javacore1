package hw14_2;

public class Address {

    private int buildingNumber;
    private String streetName;
    private String city;
    private String state;
    private int zip;

    public Address(int buildingNumber, String streetName, String city, String state, int zip) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }
    public void printAddress(){
        System.out.println(buildingNumber+" "+streetName+", "+city+", "+state+" "+zip);
    }

}
