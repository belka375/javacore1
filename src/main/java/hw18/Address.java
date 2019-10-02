package hw18;

import java.util.ArrayList;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public void getAddressInfo(){
        System.out.println(streetAddress+", "+town+", "+state+", "+zip);
    }
}
