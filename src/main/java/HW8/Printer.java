package HW8;

public class Printer {
    public static String model;
    public static boolean inkEmpty;
    public static boolean printColor;
    public static boolean on;
    public static double maxPaperSizeWidth;
    public static double maxPaperSizeLength;
    public static boolean wifiConnection;

    public static void print(){
        if(on = false){
            System.out.println("Printer is off");
        }
        else {
            if(inkEmpty = true){
                System.out.println("Printer needs refill");
            }
            else {
                System.out.println("Printer is printing");
            }
        }

    }
    public static void scan(){
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
    public static void  copy(){
        if(on = true){
            System.out.println("Printer is copying");
        }
        else {
            System.out.println("Printer is off");
        }

    }
    public static void printSettings(){
        System.out.println("Model: "+model+";\nNeed ink refill: "+inkEmpty+";\nPrint in color: "+printColor+";\nIs it on: "+on+";\nMax paper dimantions: "+maxPaperSizeLength+"x"+maxPaperSizeWidth+";\nIs it connected to the wifi: "+wifiConnection+";");
    }




}
