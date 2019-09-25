package homeWork15_2;

public class Address extends Owner implements Person{
    private int number;
    private String street;
    private String state;
    private String city;
    private int zip;

    public Address(String firstName, String lastName, int number, String street, String state, String city, int zip) {
        super(firstName, lastName);
        this.number = number;
        this.street = street;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }


    @Override
    public void printAddress() {
        System.out.println(getFirstName() +" "+ getLastName()+ ", "+number+", "+street+"\n"+state+", "+city+", "+zip);
    }

    @Override
    public void printFirstName() {
        System.out.println(getFirstName());
    }

    @Override
    public void printLastName() {
        System.out.println(getLastName());
    }
}
