package homeWork_10;

public class Work {
    public static void main(String[] args) {

        // Class FishingRod

        String[] fish = new String[]{"Bass", "Carp", "Bluegill", "Catfish", "Stripebass"};

        FishingRod rod4 = new FishingRod("Silver creek", "Pro", 7.7, 40, fish);

        FishingRod rod1 = new FishingRod();
        rod1.setBrand("Daiwa");
        rod1.setModel("Classic");
        rod1.setLength(8.2);
        rod1.setTest(120);
        rod1.setFish(fish);

        FishingRod rod2 = new FishingRod();
        rod2.setBrand("Shimano");
        rod2.setModel("Primera");
        rod2.setLength(7.4);
        rod2.setTest(80);
        rod2.setFish(fish);

        FishingRod rod3 = new FishingRod();
        rod3.setBrand("Tica");
        rod3.setModel("Lux");
        rod3.setLength(9);
        rod3.setTest(15);
        rod3.setFish(fish);

        rod1.printClass();
        System.out.println("\n*********");

        rod2.printClass();
        System.out.println("\n*********");

        rod3.printClass();
        System.out.println("\n*********");

        rod4.printDetails();


        //Class Tires

        String[] carT = new String[]{"Truck", "SUV", "Sedan"};


        Tires someTires1 = new Tires();
        someTires1.setSeason("Winter");
        someTires1.setRadius(17);
        someTires1.setWidth(265);
        someTires1.setCarTypes(carT);

        System.out.println("\n*********");
        someTires1.printTiresInfo();
        System.out.println("\n*********");


        Tires someTires2 = new Tires(20, 220, "All season");

        someTires2.printParameters();
        System.out.println("\n*********");


        //Class Perfume

        String[] stores = new String[]{"Macy's", "Target", "Nordstrom"};

        Perfume item1 = new Perfume("Versace", 125, 100, "Unisex");

        Perfume item2 = new Perfume();
        item2.setBrand("Chanel");
        item2.setVolume(90);
        item2.setGoodFitFor("Female");
        item2.setPrice(150);
        item2.setStores(stores);

        Perfume item3 = new Perfume("Boss", 100, 175, "Male");

        System.out.println("\n*********");
        item2.printWhereToBuy();

        System.out.println("\n*********");
        item1.printClassPerfume();

        System.out.println("\n*********");
        item3.printClassPerfume();
    }
}
