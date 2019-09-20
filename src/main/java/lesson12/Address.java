package lesson12;

public class Address {
    private String street;
    private  int number;
    private String city;
    private String state;
    private int zip;

    public Address(int number, String street, String state, String city, int zip){
        this.city = city;
        this.number = number;
        this.state = state;
        this.zip = zip;
        this.street = street;
    }
    public int getNumber() {
        return number;
    }
    public int getZip() {
        return zip;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getStreet() {
        return street;
    }

    public void printAdress(){
        System.out.println(number + " " +street + "\n"+state +"\n"+city+", "+zip);
    }
}
