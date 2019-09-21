package homeWork12;

public class Computer {
    private String owner;
    private Keyboard keyboard;
    private  Mouse mouse;
    private Monitor monitor;
    private SystemBlock sb;

    public Computer(String owner, Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock sb){
        this.owner = owner;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.sb = sb;
    }

    public String getOwner() {
        return owner;
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
    public SystemBlock getSb() {
        return sb;
    }

    public void printComputer(){
        System.out.println (owner);
                           keyboard.printKeyboard();
                           mouse.printMouse();
                           monitor.printMonitor();
                           sb.printSystemBlock();
    }
}
