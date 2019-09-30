package hw18;

public class Address {
    private String streetAdress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetAdress, String town, String state, int zip) {
        this.streetAdress = streetAdress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public String getTown() {
        return town;
    }
}
