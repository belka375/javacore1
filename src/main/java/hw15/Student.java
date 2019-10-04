package hw15;

public class Student implements Person {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName);
    }
}
