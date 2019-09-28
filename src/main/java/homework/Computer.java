package homework;

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

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SystemBlock getSb() {
        return sb;
    }

    public Monitor getMon() {
        return mon;
    }
}
