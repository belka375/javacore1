package homework12;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer (Monitor monitor, Keyboard keyboard, Mouse mouse){
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
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
    public void computerInfo(){
        monitor.monitorInfo();
        keyboard.keyboardInfo();
        mouse.mouseInfo();
    }

}
