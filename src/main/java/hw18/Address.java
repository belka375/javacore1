package hw18;

public class Address implements ProtoAddress{
    private String streetAddress;
    private String town;
    private String state;
    private int zip;
    private InsuranseCompanies[]companies;

    public Address(String streetAddress, String town, String state, int zip, InsuranseCompanies[]ins) {
        this.streetAddress = streetAddress;
        this.zip = zip;
        this.state = state;
        this.companies = ins;
        this.town=town;


    }

    public void printInfo() {
            System.out.println(streetAddress+" "+town+" "+state+" "+zip);
        for (InsuranseCompanies comp:companies) {
            System.out.println(comp);
        }

        }


}