package hw8;

public class Address {
    public int houseNumber;
    public String streetName;
    public String city;
    public String zipCode;
    public String state;

    public void printFullAddress () {
        System.out.println(houseNumber+" "+streetName+", " +city+", "+zipCode+" "+state );
    }
}
