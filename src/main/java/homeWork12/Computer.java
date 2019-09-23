package homeWork12;

public class Computer {


    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;

    public Computer(SystemBlock sb, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.systemBlock = sb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void printComputer() {
        System.out.println("NEW!!! Sky Blaze");
        systemBlock.printSysBlock();
        monitor.printMonitor();
        keyboard.printKeyBoard();
        mouse.printMouse();
    }
}
