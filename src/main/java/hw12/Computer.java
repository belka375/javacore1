package hw12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private SystemBlock sb;

    public Computer(Keyboard k, Monitor mon, Mouse mouse, SystemBlock sb) {
        this.keyboard = k;
        this.mon = mon;
        this.sb = sb;
        this.mouse = mouse;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setSb(SystemBlock sb) {
        this.sb = sb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMon() {
        return mon;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SystemBlock getSb() {
        return sb;
    }

    public void printComputer() {
        System.out.println("Computer info: ");
        keyboard.printKeyboardInfo();
        mon.printMonitor();
        mouse.printMouse();
        sb.printSystemBlock();
    }

}
