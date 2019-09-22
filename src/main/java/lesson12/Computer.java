package lesson12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private SystemBlock sb;

    public Computer(Keyboard k, Monitor mon, Mouse mouse, SystemBlock sb){
        this.keyboard=k;
        this.mon=mon;
        this.sb=sb;
        this.mouse=mouse;
    }

    public void printComp() {

        keyboard.printKeyboard();
        mouse.printMouse();
        mon.printMonitor();
        sb.printSystemBlock();

    }


}
