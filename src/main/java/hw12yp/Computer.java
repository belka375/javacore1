package hw12yp;

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
    public void printInfo() {
        System.out.println("------ Computer ----- ");
        keyboard.printInfo();
        mouse.printInfo();
        mon.printInfo();
        sb.printInfo();

    }


}
