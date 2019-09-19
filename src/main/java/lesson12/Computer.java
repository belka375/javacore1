package lesson12;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor mon;
    private Systemblock sb;

    public Computer(Keyboard k, Mouse m, Monitor mon, Systemblock sb){
        this.keyboard=k;
        this.mouse=m;
        this.mon=mon;
        this.sb=sb;
    }
}
