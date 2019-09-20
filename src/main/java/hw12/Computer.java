package hw12;

public class Computer {
    private SystemBlock systemBlock;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(SystemBlock sysblock, Monitor mon, Keyboard kb, Mouse mouse){
        this.systemBlock=sysblock;
        this.monitor=mon;
        this.keyboard=kb;
        this.mouse=mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
    public void printComputer(){
        systemBlock.printSystenBlock();
        monitor.printMonitor();
        keyboard.printKeyboard();
        mouse.printMouse();

    }
}
