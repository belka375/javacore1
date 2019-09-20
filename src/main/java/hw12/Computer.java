package hw12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private SystemBlock sb;

    public Computer(Keyboard k, Monitor mon, Mouse mouse, SystemBlock sb) {
        this.keyboard = k;
        this.mon = mon;
        this.mouse = mouse;
        this.sb = sb;
    }


    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMon() {
        return mon;
    }

    public SystemBlock getSb() {
        return sb;
    }
    public void printComruterInfo(){
        System.out.println("your computer is:");
        keyboard.printKeyboardInfo();
        mouse.printMouseInfo();
        mon.printMonitorInfo();
        sb.systemBlockPrintInfo();
    }
}
