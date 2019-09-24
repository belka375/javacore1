package homeWork14;

public class PC {
    private SystemBlock systemBlock;
    private Monitor monitor;
    private String keyboard;
    private String mouse;

    public PC (SystemBlock systemBlock, Monitor monitor,String keyboard, String mouse){
        this.systemBlock=systemBlock;
        this.monitor=monitor;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void printPC(){
        systemBlock.printSystemBlock();
        monitor.printMonitor();
        System.out.println("Keyboard- "+ keyboard+"\nMouse- "+ mouse);
    }

}