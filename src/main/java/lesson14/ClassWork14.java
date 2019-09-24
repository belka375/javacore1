package lesson14;

import java.time.LocalDateTime;

public class ClassWork14 {
    public static void main(String[] args) {
        Subject[] aibekSub = new Subject[]{Subject.CHEMISTRY, Subject.BIOLOGY};
        Subject[] bikaSub = new Subject[]{Subject.PHYSICS, Subject.HISTORY};

        Student aibek = new Student("Aibek", "Dosym", 1998, aibekSub, Subject.CHEMISTRY);
        Student bika = new Student("Beybit", "Dosym", 2001, bikaSub, Subject.HISTORY);
        Teacher baur = new Teacher("Baurzhan", "Dosym", 1975, Subject.MATH);

        aibek.printStudent();
        System.out.println("===================");
        bika.printStudent();
        System.out.println("===================");

        baur.printTeacher();
        System.out.println("===================");







    }
}
