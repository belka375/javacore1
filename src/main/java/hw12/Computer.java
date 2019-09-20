package hw12;



public class Computer {
    private String computerName;
    private Box box;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(String computerName, Box box, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this.computerName=computerName;
        this.box=box;
        this.monitor=monitor;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }

    public String getComputerName() {
        return computerName;
    }

    public Box getBox() {
        return box;
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

    public void printComputerInfo(){
        System.out.println("****************************");
        System.out.println(computerName);
        box.printBoxInfo();
        monitor.printMonitorInfo();
        keyboard.printKeyboardInfo();
        mouse.printMouse();

    }
}

