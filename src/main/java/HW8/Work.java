package HW8;

public class Work {
    public static void main(String[]args){
        Printer johnsPrinter = new Printer();
        Printer anotherPrinter = new Printer();
        Printer companyPrinter = new Printer();

        johnsPrinter.model = "Cannon";
        johnsPrinter.inkEmpty = false;
        johnsPrinter.printColor = false;
        johnsPrinter.on = false;
        johnsPrinter.maxPaperSizeWidth = 8.5;
        johnsPrinter.maxPaperSizeLength = 11;
        johnsPrinter.wifiConnection = true;

        companyPrinter.model = "HP";
        companyPrinter.inkEmpty = false;
        companyPrinter.printColor = true;
        companyPrinter.on = false;
        companyPrinter.maxPaperSizeWidth = 24;
        companyPrinter.maxPaperSizeLength = 36;
        companyPrinter.wifiConnection = true;

        System.out.println("Johns printer:");
        johnsPrinter.printSettings();
        System.out.println();
        johnsPrinter.print();

        System.out.println();

        System.out.println("Company printer: ");
        companyPrinter.printSettings();
        System.out.println();
        companyPrinter.print();
        companyPrinter.scan();
        companyPrinter.copy();

    }
}
