package hw15;

public class Work {
    public static void main(String[] args) {
        StandardTour tour1 = new StandardTour("Italy", "Holiday Inn", 1500, 10, "Airplane", true);
        FullPackage tour2 = new FullPackage("Spain", "Hilton", 2500, 14, "Excursion, SPA", true);
        ProtoTour tour3 = new StandardTour("Sweden", "Marriott", 2000, 7, "Ship", true);
        ProtoTour tour4 = new FullPackage("Iceland", "Apartments", 5000, 10, "Spa, excursions", true);

        System.out.println("_______________________________");
        tour1.printTourInfo();
        System.out.println();
        System.out.println("_______________________________");
        tour2.printTourInfo();
        System.out.println();
        System.out.println("_______________________________");
        tour3.printTourInfo();
        System.out.println();
        System.out.println("_______________________________");
        tour4.printTourInfo();
        System.out.println("_______________________________");

    }
}
