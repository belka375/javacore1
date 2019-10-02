package homework.hw19;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String street,String town,String state,int zip){
        this.streetAddress=street;
        this.town=town;
        this.state=state;
        this.zip=zip;}

    public void printInfo(){
        System.out.println("addres: "+streetAddress+" , "+state+" , "+zip);
    }
}
