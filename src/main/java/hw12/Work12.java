package hw12;

public class Work12 {
    public static void main(String[] args) {

        SystemBlock homesystemblock = new SystemBlock("Intel", 2, 2, "HDD");
        SystemBlock worksystemblock = new SystemBlock("AMD", 8, 4, "SSD");

        Monitor widemonitor = new Monitor("matte", 19, "black", "Samsung");
        Monitor oldmonitor = new Monitor("glossy", 15, "white", "LG");

        Keyboard kb1 = new Keyboard("Wireless", "Logitech", PCColor.RED);
        Keyboard kb2 = new Keyboard("Wired", "Misrosoft", PCColor.BLACK);

        Mouse mouse1 = new Mouse("Genius", "Wireless", PCColor.WHITE);
        Mouse mouse2 = new Mouse("Defender", "Wired", PCColor.BLUE);

        Computer newpc1 = new Computer(worksystemblock, widemonitor, kb1, mouse2);

        newpc1.printComputer();

    }
}