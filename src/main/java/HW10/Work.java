package HW10;

public class Work {
    public static void main(String[]args){
        String[] paper = new String[]{"Regular", "Photo", "Poster"};
        String[] paperTypes = new String[]{"Glossy", "Matte"};

        Printer johnsPrinter = new Printer("Cannon", false, true, 8.5, 11, true, paper);

        Printer companyPrinter = new Printer();
        companyPrinter.setModel("HP");
        companyPrinter.setInkEmpty(true);
        companyPrinter.setOn(true);
        companyPrinter.setMaxPaperSizeWidth(8.5);
        companyPrinter.setMaxPaperSizeLength(11);
        companyPrinter.setWifiConnection(true);
        companyPrinter.setTypesOfPaper(paperTypes);

        johnsPrinter.printPrinterSettings();
        companyPrinter.printPrinterSettings();

        System.out.println();

        System.out.println("********** Classes 2&3 ********** ");

        String[] movieCast = new String[]{"Brad Pitt", "Scarlet Johanson", "Jonny Depp"};
        String[] movieCast1 = new String[]{"Will Farrel", "Anna Kendrik", "John Oliver"};

        Movies houseOnTheHill = new Movies("House on the hill", "Quntine Tarantino", 1998, movieCast);
        Movies greatWeekend = new Movies( "Great Weekend", "David Lynch", 2010, movieCast1);
        Movies thisCold = new Movies("This Cold", "Martin Scorsese", 2011, movieCast);

        Movies[] theater1 = new Movies[]{houseOnTheHill, greatWeekend};
        Movies[] theater2 = new Movies[]{greatWeekend, thisCold};
        String[] Screens1 = new String[]{"iMax", "3D", "High-def", "Dolby sound"};
        String[] Screens2 = new String[]{"High-def", "Dolby sound"};

        Theaters newAmsterdam = new Theaters("New Amsterdam", "324 Amsterdam St.", 125, Screens1, theater1);
        Theaters greatView = new Theaters("Great View", "15 Bardstown Rd.", 200, Screens2, theater2);

        newAmsterdam.printTheaterDetails();
        System.out.println("------------------------------");
        System.out.println("Showing:");
        System.out.println();
        newAmsterdam.showing();

        System.out.println();
        System.out.println("*******************************************************");
        System.out.println();

        greatView.printTheaterDetails();
        System.out.println("------------------------------");
        System.out.println("Showing:");
        System.out.println();
        greatView.showing();




    }
}
