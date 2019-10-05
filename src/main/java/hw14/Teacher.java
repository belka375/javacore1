package hw14;

import java.time.LocalDateTime;

    public class Teacher extends Person {
    private Subject subject;

    public Teacher(String firstName, String lastName, LocalDateTime dob, hw14.Subject subject) {
        super(firstName, lastName, dob);
        this.subject = subject;
    }

        public void printTeacher(){
        printPerson();
        System.out.println("Subject - "+subject);
    }
}
