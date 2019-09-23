package lesson14;

import java.time.LocalDateTime;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime dob;

    public Person(String firstName, String lastName, LocalDateTime dob){
        this.dob=dob;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    protected void printPerson(){
        System.out.println("First Name: "+firstName+" Last Name: "+lastName+" Date of Birth: "+dob.toString());
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
}
