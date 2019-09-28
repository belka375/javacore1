package hw14_1;

public class Address {
    private int number;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(int number, String street, String city, String state, int zip){
        this.number=number;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public void printAddress(){
        System.out.println(number+" "+street+" "+city+" "+state+" "+zip);
    }
}


