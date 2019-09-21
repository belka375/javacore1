package lesson13;

public class Address {
    private PersonalName name;
    private String streetAddress;
    private  String state;
    private int zip;
    private String city;

    public Address (PersonalName pn, String streetAddress, String city, String state, int zip){
        this.name=pn;
        this.streetAddress=streetAddress;
        this.zip=zip;
        this.city=city;
        this.state=state;
    }
}
