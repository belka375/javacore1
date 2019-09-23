package hw12;

public class Work {
    public static void main(String[] args) {
    System.out.println("____________________________________________");

    SystemBlock systemBlock1 = new SystemBlock(Brand.ASUS, Color.BLACK, ProcessorType.INTEL);
    Monitor firstMonitor1 = new Monitor(Brand.SAMSUNG, Color.WHITE, 21);
    Mouse mouse1 = new Mouse(Brand.LOGITECH, Color.MULTICOLOR, true);
    Keyboard keyboard1 = new Keyboard(Brand.LENOVO, Color.SILVER, true);



    SystemBlock systemBlock2 = new SystemBlock(Brand.ACER, Color.MULTICOLOR, ProcessorType.AMD);
    Monitor firstMonitor2 = new Monitor(Brand.LENOVO, Color.GOLD, 50);
    Monitor secondMonitor2 = new Monitor(Brand.SAMSUNG, Color.ORANGE, 50);
    Mouse mouse2 = new Mouse(Brand.LOGITECH, Color.MULTICOLOR, true);
    Keyboard keyboard2 = new Keyboard(Brand.APPLE, Color.GREY, true);


    Computer computer1 = new Computer(keyboard1, firstMonitor1, mouse1, systemBlock1);
    computer1.computerDescription();

    System.out.println("____________________________________________");

    Computer computer2 = new Computer(keyboard2, firstMonitor2, secondMonitor2, mouse2, systemBlock2);
    computer2.computerDescription2();
    }
}
