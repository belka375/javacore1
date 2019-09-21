package hw12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private SystemBlock sb;

    public Computer(SystemBlock sb,Monitor mon,Keyboard k,Mouse mouse){
        this.keyboard=k;
        this.mon=mon;
        this.sb=sb;
        this.mouse=mouse;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }
    public Mouse getMouse() {
        return mouse;
    }
    public Monitor getMon() {
        return mon;
    }
    public SystemBlock getSb() {
       return sb;
    }
    public void printComputer(){
        System.out.println("Keyboard:");
        keyboard.printKeyboard();
        System.out.println("Mouse:");
        mouse.printMouse();
        System.out.println("Monitor:");
        mon.printMonitor();
        System.out.println("System block:");
        sb.printSystemBlock();

    }
}
