package lesson12;

public class Computer {
    private Keyboard keyboard;
    private Mouse[] mouses;
    private Monitor mon;
    private SystemBlock sb;

    public Computer(Keyboard k, Monitor mon, Mouse[] mouses, SystemBlock sb) {
        this.keyboard = k;
        this.mon = mon;
        this.sb = sb;
        this.mouses= mouses;

    }



    public void printComputer() {
        System.out.println("This PC includes: ");

        keyboard.printKeyboard();
        System.out.println("Also it includes: ");
        for ( Mouse mou : mouses
        ) {
            mou.printMouseInfo();}

            System.out.println("Moreover: ");
            mon.printMonitor();

            sb.printSb();

        }
    }
