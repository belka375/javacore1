package hw18;

public class Address implements ProtoAddress{
    private String streetAddress;
    private String town;
    private String state;
    private int zip;
    private InsuranseCompanies[]companies;

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
        this.state = state;
        this.town=town;


    }

    public void printInfo() {
        System.out.println(streetAddress + " " + town + " " + state + " " + zip);

        }
    }


