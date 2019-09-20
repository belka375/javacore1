package homeWork_12;

public class Work {
    public static void main(String[] args) {


        Monitor monitor = new Monitor("Phillips", "MT22525", 25);
        Monitor monitor2 = new Monitor("Sony", "S9009", 22);

        Keyboard keyboard = new Keyboard("Wireless", "Logiteh", "L5050");
        Keyboard keyboard2 = new Keyboard("Standart", "Asus", "A7070");

        Mouse mouse = new Mouse("Microsoft", "M1383", "Gaming");
        Mouse mouse2 = new Mouse("LG", "L15", "PRO");

        SystemBlock systemBlock = new SystemBlock("Dell", 6, 3.5, 300);
        SystemBlock systemBlock2 = new SystemBlock("Asus", 4, 3.3, 250);

        Computer comp1 = new Computer(keyboard, monitor, mouse, systemBlock);
        Computer comp2 = new Computer(keyboard2, monitor2, mouse2, systemBlock2);

        comp1.printComputerInfo();
        System.out.println("===============================================================================");
        comp2.printComputerInfo();
    }

}
