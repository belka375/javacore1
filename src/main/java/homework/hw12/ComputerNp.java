package homework.hw12;

public class ComputerNp {

        private String brand;
        private int year;
        private double price;
        private MonitorN monitor;
        private Keyboard keyboard;
        private Mouse mouse;
        private SystemBlock systemBlock;

        String[] type =new String[]{"wired", "wireless","bluetooth"};

    public ComputerNp(String brand,int yr,double pr,MonitorN monitor,Keyboard key,Mouse mouse,SystemBlock sb){
            this.brand = brand;
            this.year = yr;
            this.price = pr;
            this.monitor = monitor;
            this.keyboard = key;
            this.mouse = mouse;
            this.systemBlock = sb;
        }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public MonitorN getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;

    }

    public void printComputerNp(){
            System.out.print("COMPUTER "+" brand: "+brand+"\nyear: "+year+"  price: "+price+"\nMONITOR"+"\n");
            monitor.printMonitorN();
            System.out.println("KEYBOARD");
            keyboard.printKeyboard();
            System.out.println("SYSTEM BLOCK");
            systemBlock.printSystemBlock();
            System.out.println();
        }
 }
