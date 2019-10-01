package homeWork_18;

public class Address {
    private String streetName;
    private String town;
    private String state;
    private int zip;

    public Address(String streetName, String town, String state, int zip) {
        this.streetName = streetName;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public void printAddress() {
        System.out.println(streetName + "\n" + town + ", " + state + " (" + zip + ")");
    }
}
