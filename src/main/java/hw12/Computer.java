package hw12;

public class Computer {
    private String monitor;
    private String keyboard;
    private String mouse;
    private String systemBlock;

    public Computer(String monitor, String keyboard, String mouse, String systemBlock) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public void printInfo() {
        System.out.println(monitor + ", " + keyboard + ", " + mouse + ", " + systemBlock);
    }
}
