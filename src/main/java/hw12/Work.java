package hw12;

public class Work {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("LG", ScreenSize.SIZE2_27);
        Monitor monitor2 = new Monitor("Samsung", ScreenSize.SIZE3_32);

        Keyboard keyboard1 = new Keyboard("Logitech K380", Colors.BLUE);

        Mouse mouse1 = new Mouse("Magic Mouse", Colors.WHITE);
        Mouse mouse2 = new Mouse("Logitech MS MAster 2S", Colors.BLACK);


        SystemBlock systemBlock1 = new SystemBlock(16, 2.4, StorageGB.GB512);

        Computer computer1 = new Computer(monitor1, keyboard1, mouse1, systemBlock1);
        Computer computer2 = new Computer(monitor2, keyboard1, mouse2, systemBlock1);

        String a = computer1.getMouse().getModel();
        String b = computer2.getMouse().getModel();

        System.out.println(a);
        System.out.println(b);
    }
}
