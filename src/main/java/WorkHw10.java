import Homework10.*;

public class WorkHw10 {

    public static void main(String[] args) {
        String[] games = {"Black Jack", "Craps", "Poker"};
        String[] games2 = {"Pai Gow", "Slots", "Roulette"};

        Casino casino1 = new Casino( "Big Winner", 5, games );
        Casino casino2 = new Casino();
        casino2.setName("Royal");
        casino2.setRating(10);
        casino2.setGames(games2);

        casino1.printClass();
        casino2.printClass();

        TennisRacket  fedracket = new TennisRacket("Wilson",96.5,265.7,4.25 );
        fedracket.printClass1();

        TennisRacket rafaracket = new TennisRacket();
        rafaracket.setBrand("Babolat Pure Aero");
        rafaracket.setGrib( 4.75);
        rafaracket.setHead(100.2);
        rafaracket.setWeight(310);

        rafaracket.printClass1();

        Volunteer volunteer1 = new Volunteer( "Marry Fox", "1212 11 Street Santa Monica", "nm@qa.com", "nurse");
        Volunteer volunteer2 = new Volunteer("Pete Dorman", " 5606 Lincoln Str Los Angeles", "pd@yahoo.com", "dentist");
        Volunteer volunteer3 = new Volunteer("Dave Rankin", " 12 Buffet Ave Santa Ana", "daver@hotmail.com", "teacher");
        volunteer3.printClass();










    }
}