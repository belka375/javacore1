package hw12;

public class Work {
    public static void main(String[] args) {
        Box asusBox = new Box(8,32, 256);
        Monitor asusMonitor=new Monitor(24, MonitorType.LED, MonitorPorts.HDMI);
        Keyboard asusKeyboard=new Keyboard("English", 104, KeyboardType.BASIC);
        Mouse asusMouse=new Mouse(3, MouseType.OPTICAL);

        Computer asus= new Computer("ASUS",asusBox,asusMonitor,asusKeyboard,asusMouse);
        asus.printComputerInfo();

        Box aserBox = new Box (8, 32, 512);
        Monitor aserMonitor=new Monitor(32, MonitorType.LCD, MonitorPorts.HDMI);
        Keyboard aserKeyboard =new Keyboard("Russian", 124, KeyboardType.EXTENDED);
        Mouse aserMouse =new Mouse(3, MouseType.WIRELESS_OPTICAL);

        Computer aser = new Computer("ASER",aserBox,aserMonitor,aserKeyboard,aserMouse);
        aser.printComputerInfo();

    }
}
