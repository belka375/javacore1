package lesson14;

import java.time.LocalDateTime;

public class Classwork {
    public static void main(String[] args){

        Subject[] dashaSubjects=new Subject[]{Subject.HISTORY, Subject.LANGUAGE};

        Student dasha=new Student("Dasha", "Jenkins", LocalDateTime.of(2001, 01, 1,11, 1),dashaSubjects,Subject.LANGUAGE);

        Teacher anthony =new Teacher("Anthony", "James", LocalDateTime.of(2001, 1, 11,2,10),Subject.LANGUAGE);

        anthony.setLastName("Korun");
        anthony.printTeacher();
        dasha.printStudent();




    }
}
