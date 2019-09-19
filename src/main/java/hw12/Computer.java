package hw12;

public class Computer {
    private String name;
    private Monitor monitor;
    private SystemBlock systemBlock;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(String name, Monitor monitor, SystemBlock systemBlock, Keyboard keyboard, Mouse mouse){
        this.name=name;
        this.monitor=monitor;
        this.systemBlock=systemBlock;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }

    public void printPC(){
        System.out.println("______________________________________");
        System.out.println("This is specs of "+name);
        monitor.printClass();
        systemBlock.printClass();
        keyboard.printClass();
        mouse.printClass();
    }
}
