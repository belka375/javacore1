package lesson12;

public class Monitor {
    private String brand;
    private String charac;




    public Monitor(String brand, String charac){
        this.brand=brand;
        this.charac=charac;
    }
    public void printMonitor(){
        System.out.println("This monitor is by "+ brand+". It has following characteristics "+ charac);

    }
}
