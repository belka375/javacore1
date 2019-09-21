package lesson13;

public class Address {
    private PersonalName name;
    private String streetAddress;
    private String state;
    private int zip;
    private String city;

    public Address(PersonalName pn, String streetAddress, String city, String state, int zip){
        this.name=pn;
        this.streetAddress=streetAddress;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }


    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public PersonalName getName() {
        return name;
    }
}
