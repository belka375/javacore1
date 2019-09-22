package hw14.superchild;

import java.time.LocalDateTime;

public class Owner {
    private String firstName;
    private String lastName;
    LocalDateTime dob;

    public Owner(String firstName, String lastName, LocalDateTime dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
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

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDateTime getDob() {
        return dob;
    }
    public void printOwner(){
        System.out.println("Car owner first Name: "+firstName+" last Name: "+lastName+" Date of Birth: "+dob.toString());
    }
}
