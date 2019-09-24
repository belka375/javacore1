package lesson14;


public class Person {
    protected String firstName;
    protected String lastName;
    protected int data;

    public Person(String firstName, String lastName, int data){
        this.data = data;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getData() {
        return data;
    }
    public  void printPerson(){
        System.out.println("Name is " + firstName +" "+lastName + " year of birth: "+data);
    }
}
