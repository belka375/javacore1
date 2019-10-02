package lesson16;

public class Person extends Address{
    private Address address;
    private  String name;
    private  int numb;
    public   String lastName;

    public Person(String name, int numb, String lastName, int number, String street, String state, String city, int zip) {
        super(number, street, state, city, zip);
        this.name = name;
        this.numb = numb;
        this.lastName = lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumb() {
        return numb;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }
    char i = ' ';
    void printPerson(){
        System.out.println(name +i +lastName+i+numb);
    }
}
