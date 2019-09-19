package lesson12;

public class Computer {
    private Keyboard keyboard;
    private  Mouse mouse;
    private Monitor mon;
    private SystemBlock sb;

    public Computer (Keyboard k, Monitor mon, Mouse m, SystemBlock sb){
        this.keyboard=k;
        this.mon=mon;
        this.mouse=mouse;
        this.sb=sb;
    }
}
