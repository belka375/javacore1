package lesson12;

public class ClassWork {
    public static void main(String[] args) {

        Student Aibek = new Student("Aibek", "Disym", 10306);
        Student Bika = new Student("Beibut", "Dosym", 10305);
        Student Iman = new Student("Iman", "Dosym", 10307);

        Student[]sds = new Student[]{Aibek, Bika, Iman};

        Address schoolAddress = new Address(122, "Cedar ave.", "New York", "Staten Island", 10304);

        School mathSchool = new School("Euclid", schoolAddress, sds);

        mathSchool.printSchool();

    }

}
