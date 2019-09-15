package HW8;

public class Printer {
    public  String model;
    public  boolean inkEmpty;
    public  boolean printColor;
    public  boolean on;
    public  double maxPaperSizeWidth;
    public  double maxPaperSizeLength;
    public  boolean wifiConnection;

    public  void print(){
        if(on = false){
            System.out.println("Printer is off");
        }
        else {
            if(inkEmpty = true){
                System.out.println("Printer needs refill");
            } else {
                System.out.println("Printer is printing");
            }
        }

    }
    public  void scan(){
        if(on = false){
            System.out.println("Printer is off");
        }
        else {
            if(wifiConnection = false){
                System.out.println("Connect your printer to the wifi");
            }
            else {
                System.out.println("Printer is scanning");
            }
        }
    }
    public  void  copy(){
        if(on = true){
            System.out.println("Printer is copying");
        }
        else {
            System.out.println("Printer is off");
        }

    }
    public  void printSettings(){
        System.out.println("Model: "+model+";\nNeed ink refill: "+inkEmpty+";\nPrint in color: "+printColor+";\nIs it on: "+on+";\nMax paper dimantions: "+maxPaperSizeLength+"x"+maxPaperSizeWidth+";\nIs it connected to the wifi: "+wifiConnection+";");
    }




}

