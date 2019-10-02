package homeWork19;

public class Address {
    private int number;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(int number, String street, String city, String state, int zip) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getNumber() {
        return number;
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

    public String getStreet() {
        return street;
    }
    public void printInfo(){
        System.out.println("Address is: "+number+", "+street+", "+city+", "+state+", zip code is "+zip);
    }
}
