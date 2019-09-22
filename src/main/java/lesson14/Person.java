package lesson14;

import hw12.SystemBlock;

import java.time.LocalDateTime;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime dob;

    public Person(String firstName, String lastName, LocalDateTime dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }

    protected void printPerson(){
        System.out.println("First Name: "+firstName+ " Last Name: "+lastName+" Date of Birth: "+ dob.toString());


    }

    public LocalDateTime getDob() {
        return dob;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
}
