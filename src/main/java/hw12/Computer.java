package hw12;

public class Computer {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private SystemBlock systemBlock;

    public Computer (Monitor monitor, Keyboard keyboard, Mouse mouse, SystemBlock systemBlock) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
