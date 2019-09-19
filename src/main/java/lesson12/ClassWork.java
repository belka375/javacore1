package lesson12;

public class ClassWork {
    public static void main(String[] args) {

        Student dina = new Student("Dina","Ivanova",102);
        Student boris=new Student("Boris","Jameson",103);
        Student alex = new Student("Alex","Mishin",104);
        Student mina = new Student("Mina","Ivanova",105);
        Student doris=new Student("Doris","Jameson",106);
        Student malex = new Student("Malex","Mishin",107);


        Student[] sds=new Student[]{dina,boris,alex,mina,doris,malex};

        Address schoolAddress = new Address("155 Columbus ave","Brooklyn","New York",11235);

        School mathSchool = new School("Mathematic School",sds,schoolAddress);

        mathSchool.printSchool();

//        Monitor monitor = new Monitor();
//        Keyboard keyboard=new Keyboard();
//        Mouse mouse=new Mouse();
//        SystemBlock systemBlock=new SystemBlock();
//
//        Computer toshiba=new Computer(keyboard,monitor,mouse,systemBlock);


    }
}
