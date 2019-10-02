package homeworkTheater;

public class Printer {
    private String model;
    private boolean inkEmpty;
    private boolean printColor;
    private boolean on;
    private double maxPaperSizeWidth;
    private double maxPaperSizeLength;
    private boolean wifiConnection;
    private String[] typesOfPaper;


    public Printer(String model, boolean inkEmpty, boolean on, double maxPaperSizeWidth, double maxPaperSizeLength, boolean wifiConnection, String[]typesOfPaper ){
        this.model = model;
        this.inkEmpty = inkEmpty;
        this.on = on;
        this.maxPaperSizeWidth = maxPaperSizeWidth;
        this.maxPaperSizeLength = maxPaperSizeLength;
        this.wifiConnection = wifiConnection;
        this.typesOfPaper = typesOfPaper;
    }

    public Printer(){}

    public void printPrinterSettings(){
        System.out.println("----------------------------");
        System.out.println("Model: "+model+";\nNeed ink refill: "+inkEmpty+";\nPrint in color: "+printColor+";\nIs it on: "+on+";\nMax paper dimantions: "+maxPaperSizeLength+"x"+maxPaperSizeWidth+";\nIs it connected to the wifi: "+wifiConnection+";");
        System.out.print("Types of paper: ");
        for (String paper: typesOfPaper){
            System.out.print(paper+", ");
        }
        System.out.println();
    }



    public void setModel(String model) {
        this.model = model;
    }

    public void setInkEmpty(boolean inkEmpty) {
        this.inkEmpty = inkEmpty;
    }

    public void setPrintColor(boolean printColor) {
        this.printColor = printColor;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setMaxPaperSizeWidth(double maxPaperSizeWidth) {
        this.maxPaperSizeWidth = maxPaperSizeWidth;
    }

    public void setMaxPaperSizeLength(double maxPaperSizeLength) {
        this.maxPaperSizeLength = maxPaperSizeLength;
    }

    public void setWifiConnection(boolean wifiConnection) {
        this.wifiConnection = wifiConnection;
    }

    public void setTypesOfPaper(String[] typesOfPaper) {
        this.typesOfPaper = typesOfPaper;
    }
}

