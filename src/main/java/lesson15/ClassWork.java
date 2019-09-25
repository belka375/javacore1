package lesson15;

public class ClassWork {
    public static void main(String[] args){

        Student ivan = new Student("Ivan","Susanin");
        Teacher maya = new Teacher("Maya", "Dowson");
        //так как у нас class Parson - abstract  - we can t create one object of this class
       // Person person = new Person ("Fedor", "Person");
        // but we can create polimorfizm - Person - parent - Student - child
        // we give for the parent class give attributes of the child class
        Person ilya=new Student("Ilya", "Pertzov");
        Person john = new Teacher("John", "Watson");

        ProtoPerson shelly = new Student("Shelly", "Ostrowsky");
        ProtoPerson mark = new Teacher("Mark", "Rousevelt");
        ProtoPerson abstractPerson = new Person("Some", "Person");

        printPerson(ivan);

    }
    private static void printPerson(ProtoPerson pp){
        pp.printInfo();
    }

}
