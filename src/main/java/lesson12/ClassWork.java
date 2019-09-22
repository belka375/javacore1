package lesson12;

public class ClassWork {
    public static void main(String[] args){

        Student dina = new Student("Dina", "Ivanova", 102);
        Student boris = new Student("Boris", "Jameson", 103);
        Student alex = new Student("Alex","Mishin", 104);
        Student[] sds=new Student[]{dina, boris, alex};

        Address schoolAddress = new Address("155 Columbus ave", "Brooklin", "NY", 11211);

        School mathSchool = new School("Mathematic School", sds,schoolAddress);
        mathSchool.printSchool();


        Monitor monitor = new Monitor();
        Keyboard keyboard=new Keyboard();
        Mouse mouse = new Mouse();
        SystemBlock systemBlock = new SystemBlock();

        Computer toshiba = new Computer(keyboard, monitor, mouse, systemBlock);



    }
}
