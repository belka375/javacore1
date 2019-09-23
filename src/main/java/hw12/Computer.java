package hw12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private Monitor secondMonitor;
    private SystemBlock systemBlock;

    public Computer(Keyboard key, Monitor mon, Mouse mou, SystemBlock sys){
        this.keyboard = key;
        this.monitor = mon;
        this.mouse = mou;
        this.systemBlock = sys;
    }

    public Computer(Keyboard key2, Monitor mon2, Monitor mon22, Mouse mou2, SystemBlock sys2){
        this.keyboard = key2;
        this.monitor = mon2;
        this.secondMonitor = mon22;
        this.mouse = mou2;
        this.systemBlock = sys2;
    }

    public void computerDescription(){
        System.out.println("\nComputer contains: ");
        systemBlock.sysDescription();
        monitor.monitorDescription();
        mouse.mouseDescription();
        keyboard.keyboardDescription();
    }

    public void computerDescription2(){
        System.out.println("\nComputer contains: ");
        systemBlock.sysDescription();
        monitor.monitorDescription();
        secondMonitor.monitorDescription();
        mouse.mouseDescription();
        keyboard.keyboardDescription();
    }
}


