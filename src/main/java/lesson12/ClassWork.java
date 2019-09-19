package lesson12;

public class ClassWork {
    public static void main(String[] args) {
        Student dina = new Student("Dina" , "Ivanova", 120);
        Student boris = new Student("Boris", "Jameson", 103);
        Student alex = new Student("Alex", "Mishin", 104);
        Student[] sds = new Student[]{dina, boris, alex};

        Address schoolAddress = new Address("155 Columbus Ave.", "Brooklin", "New York", 11235);

        School mathSchool = new School("Mathematic School", sds, schoolAddress);

        mathSchool.printSchool();

//        Monitor monitor=new Monitor();  NEW
//        Keyboard keyboard=new Keyboard();
//        Mouse mouse=new Mouse();
//        Systemblock systemblock = new Systemblock();
//
//        Computer toshiba = new Computer(keyboard, monitor, mouse, systemblock);


    }
}
