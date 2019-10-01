package hw19byTanik;

public class Address {

    private String street;
    private String town;
    private String state;
    private int zip;


    public Address(String street, String town, String state, int zip){
        this.street=street;
        this.town=town;
        this.state=state;
        this.zip=zip;
    }

    public void printInfo(){
        System.out.print(street+", "+town+", "+state+", "+zip);
    }
}
