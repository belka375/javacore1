package hw18;

public class Address {
<<<<<<< HEAD

=======
>>>>>>> origin/AA81
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

<<<<<<< HEAD
    public Address(String streetAddress, String town, String state, int zip) {
=======
    public Address (String streetAddress, String town, String state, int zip) {
>>>>>>> origin/AA81
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }
<<<<<<< HEAD
public void printAddress(){
    System.out.println(streetAddress+  ", " +town+ ", " +state+ ", " +zip);
}
=======

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void printAddress () {
        System.out.println(streetAddress + " " + town + " " + state + " " + zip);
    }

>>>>>>> origin/AA81
}
