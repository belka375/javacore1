package lesson14;

import java.time.LocalDateTime;

public class Student extends  Person{

    private Subject[] subjects;
    private Subject major;

    public Student(String firstName,String lastName, LocalDateTime dob, Subject[]subjects, Subject major){
        super(firstName,lastName,dob);
        this.subjects=subjects;
        this.major=major;
    }

    public void printStudent(){
        printPerson();
        System.out.println("Major: "+major);
        for (Subject s:subjects){
            System.out.println(s);
        }
    }

}
