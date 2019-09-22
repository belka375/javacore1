package lesson14;

import hw12.SystemBlock;

import java.time.LocalDateTime;

public class Student extends Person {

    private Subject [] subjects;
    private Subject major;


    public Student(String firstName,String lastName,LocalDateTime dob, Subject[] subjects,Subject major){

        super(firstName, lastName,dob);

        this.subjects=subjects;
        this.major=major;
    }

    public void printStudent(){
        printPerson();
        System.out.println("Major "+major);
        for(Subject s:subjects){
            System.out.println(s);
        }
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

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }
}
