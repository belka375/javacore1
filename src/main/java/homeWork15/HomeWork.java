package homeWork15;

public class HomeWork {
    public static void main(String[] args) {
         Hyaenidae  aardwolf = new Hyaenidae("Feliformia", " Aardwolf", "Africa", 4);
         Hyaenidae  hyaena = new Hyaenidae("Feliformia", "Hyaena", "Africa , Asia, India", 4);

         Mephitidae skunk = new Mephitidae("Caniformia", "Skunk", "America", 4);
         Mephitidae conepatus = new Mephitidae("Caniformia", "Conepatus", "America", 4);

         hyaena.getReproduction("East Asia");

         aardwolf.printPredator();
        System.out.println("=========================");

        hyaena.printPredator();
        System.out.println("=========================");

        skunk.printPredator();
        System.out.println("=========================");

        conepatus.printPredator();
        System.out.println("=========================");

        System.out.println("=========================");
        skunk.eatPrey();
         System.out.println("=========================");
         skunk.hunter();
        System.out.println("=========================");
        aardwolf.eatPrey();
        System.out.println("=========================");
        aardwolf.hunter();
        System.out.println("=========================");


    }
}
