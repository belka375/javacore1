package lesson13;
import homeWork12.*;

public class ClassWork {
    public static void main(String[] args) {

        Owner aibek = new Owner("Aibek", "Dosym", 53680);
        Address aibekAddress = new Address(aibek, 122, "Mapleton ave.", "New York", "Staten Island", 10306);

        Monitor monitor = new Monitor("Samsung", "Black", 17, 150.50);
        Keyboard keyboard = new Keyboard("Assus", "Black", "Wireless", 32.42);
        Mouse mouse = new Mouse("Assus", "Black", "wireless", 28.25);
        SystemBlock sb = new SystemBlock("Norway", "Black", 140.25);

        Computer myComp = new Computer("Aibek Dodym", keyboard,mouse, monitor, sb);

        House aibekh = new House(aibekAddress, 2, 4, myComp);


        aibekh.printHouse();
        aibek.printOwner();
        myComp.printComputer();
        String an = aibekAddress.getOwner().getName();
        System.out.println(an);




    }
}
