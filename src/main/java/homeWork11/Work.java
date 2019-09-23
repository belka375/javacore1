package homeWork11;

public class Work {
    public static void main(String[] args) {

       Relative aibek = new Relative(Sons.AIBEK, 21, "Swimming");
       Relative bika = new Relative(Sons.BIKA, 18, "Boxing");
       Relative iman = new Relative(Sons.IMAN, 11, "Dancing");
               iman.setAge(12);
               iman.setSport("Swimming");
               aibek.setSport("Hiking");

        aibek.printSons();
        System.out.println("=========================");

        bika.printSons();
        System.out.println("=========================");

        iman.printSons();
        System.out.println("=========================");

        RelativeAlmaty berik = new RelativeAlmaty(Cousins.BERIK, "Zh", 21, "Bota", "Marat");
        RelativeAlmaty nuka = new RelativeAlmaty(Cousins.NUKA, "Zh", 18, "Bota", "Marat");
        RelativeAlmaty alibek = new RelativeAlmaty(Cousins.ALIBEK, "Zh", 16, "Bota", "Marat");
        RelativeAlmaty mika = new RelativeAlmaty(Cousins.MICHAEL, "Drachuk", 11, "Nadya", "Alex");
        RelativeAlmaty leo = new RelativeAlmaty(Cousins.LEO, "Drachuk", 6, "Nadya", "Alex");
        RelativeAlmaty nastya = new RelativeAlmaty(Cousins.NASTASYA, "Kotova", 16, "Katya", "Ivan");
        RelativeAlmaty natali = new RelativeAlmaty(Cousins.NATALY, "Kotova", 28, "Olga", "Ivan");

        berik.printCousin();
        System.out.println("=========================");

        nuka.printCousin();
        System.out.println("=========================");

        alibek.printCousin();
        System.out.println("=========================");

        mika.printCousin();
        System.out.println("=========================");

        leo.printCousin();
        System.out.println("=========================");

        nastya.printCousin();
        System.out.println("=========================");

        natali.printCousin();
        System.out.println("=========================");
 








    }
}
