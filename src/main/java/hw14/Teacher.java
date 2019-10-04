package hw14;

import lesson14.Subject;

import java.time.LocalDateTime;

    public class Teacher extends Person {
    private Subject subject;

    public Teacher(String firstName, String lastName, LocalDateTime dob) {
        super(firstName, lastName, dob);
        this.subject = subject;
    }

        public void printTeacher(){
        printPerson();
        System.out.println("Subject - "+subject);
    }
}
