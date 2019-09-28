package lesson14;

import java.time.LocalDateTime;

public class ClassWork {

    public static void main(String[] args) {
        Subject[]dashaSubjects=new Subject[]{Subject.BIOLOGY,Subject.CHEMISTRY};
        Student dasha= new Student("Dasha","Jennings",LocalDateTime.of(2002,1,1,0,0,0),dashaSubjects,Subject.CHEMISTRY);

        Teacher anthony=new Teacher("Anthony","James",LocalDateTime.of(1985,2,8,0,0,0),Subject.MATH);

        anthony.setLastName("Johnson");
        anthony.printTeacher();
        anthony.printTeacher1();

        dasha.printStudent();
    }
    Subject[] sub = new Subject[]{Subject.CHEMISTRY, Subject.BIOLOGY};
    ProtoPerson shelly = new Student("Shelly","Ostrovsky",LocalDateTime.of(2002,1,1,0,0,0), sub ,Subject.CHEMISTRY);

    private static void printPerson(ProtoPerson pp) {
        pp.printInfo();
    }


}