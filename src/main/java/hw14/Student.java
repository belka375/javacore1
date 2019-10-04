package hw14;

import lesson14.Subject;

import java.time.LocalDateTime;

public class Student extends Person {
    private Subject[] subjects;
    private String major;

    public Student(String firstName, String lastName, LocalDateTime dob, Subject[] subjects, String major) {
        super(firstName,lastName,dob);
        this.subjects = subjects;
        this.major = major;
    }

    public void printStudent() {
        printPerson();
        System.out.println("Major: "+major);
        for (Subject s : subjects) {
            System.out.println(s);
        }
    }
}


