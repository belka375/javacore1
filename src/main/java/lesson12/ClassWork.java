package lesson12;

public class ClassWork {
    public static void main(String[] args) {

//        Student dina = new Student("Dina","Ivanova",102);
//        Student boris=new Student("Boris","Jameson",103);
//        Student alex = new Student("Alex","Mishin",104);
//        Student mina = new Student("Mina","Ivanova",105);
//        Student doris=new Student("Doris","Jameson",106);
//        Student malex = new Student("Malex","Mishin",107);
//
//
//        Student[] sds=new Student[]{dina,boris,alex,mina,doris,malex};
//
//        Address schoolAddress = new Address("155 Columbus ave","Brooklyn","New York",11235);
//
//        School mathSchool = new School("Mathematic School",sds,schoolAddress);
//
//        mathSchool.printSchool();

//        Monitor monitor = new Monitor();
//        Keyboard keyboard=new Keyboard();
//        Mouse mouse=new Mouse();
//        SystemBlock systemBlock=new SystemBlock();
//
//        Computer toshiba=new Computer(keyboard,monitor,mouse,systemBlock);

        //computer1
        Monitor myMonitor=new Monitor("HP", "SF350", 24, "1920x1080");
        Mouse myMouse=new Mouse("Logitech", "M510", true);
        Keyboard myKeyboard=new Keyboard("Logitech", "NMR400", "black", false);
        SystemBlock mySystemBlock=new SystemBlock("DELL", "Windows 10","12GB");

        Computer usedComputer=new Computer(myKeyboard, myMonitor,myMouse, mySystemBlock);
        System.out.println("Computer #345");
        System.out.println("-----------------------");
        usedComputer.printComputerInfo();

        //computer2
        Monitor newMonitor=new Monitor("Samsung", "AFR456", 32, "2040x3060");
        Mouse newMouse=new Mouse("Logitech", "GF567", false);
        Keyboard newKeyboard=new Keyboard("Logitech", "htr56", "white", true);
        SystemBlock newSystemBlock=new SystemBlock("ASUS", "Windows 10","8GB");

        Computer newComputer=new Computer(newKeyboard,newMonitor,newMouse, newSystemBlock);
        System.out.println("Computer #01");
        System.out.println("-----------------------");
        newComputer.printComputerInfo();

        








    }
}
