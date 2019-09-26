package lesson15;

public class ClassWork {
    public static void main(String[] args) {

        Student ivan=new Student("Ivan", "Susanin");
        Teacher maya=new Teacher("Maya","Dowson");



        Person ilya=new Student("Ilya", "Pertzev");
        Person john = new Teacher("John", "Watson");

        ProtoPerson shelly = new Student("Shelly", "Ostrovsky");
        ProtoPerson mark = new Teacher("Mark", "Rousvelt");
        ProtoPerson abstractPerson = new Person("Some", "Person");

     printPerson(ivan);



    }

    private static void printPerson(ProtoPerson pp) {
        pp.printInfo();
    }
}
