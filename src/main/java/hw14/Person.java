package hw14;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int personId;

    public Person(String fName, String lName, int personId){
        this.firstName=fName;
        this.lastName=lName;
        this.personId=personId;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPersonId() {
        return personId;
    }

    protected void printPerson(){
        System.out.println("First Name: "+firstName+" Last Name: "+lastName+" Person ID: "+personId);
    }

}
