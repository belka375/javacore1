package lesson13;

public class PersonalName {
    private String firstName;
    private String lastName;

    public PersonalName(String fn, String ln){
        this.firstName=fn;
        this.lastName=ln;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
