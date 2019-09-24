package homeWork14_part1;

public class Address {
    private int buildingNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    public Address(int buildingNumber, String street, String city, String state, int zipCode, String country) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void printAddressInfo() {
        System.out.println("Address:" + "\n" + street + ",\n" + city + ", " + state + ", " + zipCode + " \n" + country);
    }
}
