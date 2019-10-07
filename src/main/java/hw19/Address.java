package hw19;

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

    public void printAddress(){
        System.out.println(buildingNumber+" "+streetName+"\n"+city+" "+state+" "+zip);
    }

}
