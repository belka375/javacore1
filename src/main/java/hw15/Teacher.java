package hw15;

public class Teacher implements Person {
    private String firstName;
    private String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName);

    }
}
