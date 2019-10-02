package lesson16;

public class Address {
    private int number;
    private String street;
    private String state;
    private String city;
    private int zip;

    public Address(int number, String street, String state, String city, int zip) {
        this.number = number;
        this.street = street;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public int getNumber() {
        return number;
    }
}
