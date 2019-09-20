package homeWork_12;

public class Computer {

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private SystemBlock sysb;

    public Computer(Keyboard k, Monitor mon, Mouse mouse, SystemBlock sb) {
        this.keyboard = k;
        this.mon = mon;
        this.mouse = mouse;
        this.sysb = sb;
    }

    public void printComputerInfo() {
        sysb.printSystemBlockInfo();
        mon.printMonitorInfo();
        keyboard.printKeyboardInfo();
        mouse.printMouseInfo();

    }
}
