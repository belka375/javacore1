package homeWork12;

public class HomeWork12 {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("Samsung", "Black", 17, 150.50);
        Keyboard keyboard = new Keyboard("Assus", "Black", "Wireless", 32.42);
        Mouse mouse = new Mouse("Assus", "Black", "wireless", 28.25);
        SystemBlock sb = new SystemBlock("Norway", "Black", 140.25);
        sb.printSystemBlock();
        mouse.printMouse();
        keyboard.printKeyboard();
        monitor.printMonitor();

    }
}
