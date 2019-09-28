package hw14_2;

import java.time.LocalDateTime;

public class GymPerson {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime dob;

    public GymPerson(String firstName, String lastName, LocalDateTime dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public String getLastName() {
        return lastName;
    }

    protected void printGymPerson(){
        System.out.println(firstName+" "+lastName+" "+dob);
    }

}
