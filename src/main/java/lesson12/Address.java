package lesson12;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zip;

    public Address(String streetAddress,String city, String state, int zip){
        this.city=city;
        this.streetAddress=streetAddress;
        this.state=state;
        this.zip=zip;
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

    public String getStreetAddress() {
        return streetAddress;
    }
    public void printAddress(){
        System.out.println(streetAddress+"\n"+city+" "+state+" \n"+ zip);
    }
}
