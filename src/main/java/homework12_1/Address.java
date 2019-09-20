package homework12_1;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zip;


    public Address(String streetAddress, String city, String state, int zip ){
        this.streetAddress=streetAddress;
        this.city=city;
        this.state=state;
        this.zip=zip;
        }

public String getStreetAddress() {
        return streetAddress;
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
public void printAddress(){
        System.out.println("Our Zoo: " +streetAddress+ ",\n" +city+" " +state+ "\n" +zip);
        }
        }
