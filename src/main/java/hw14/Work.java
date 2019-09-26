package hw14;

public class Work {
    public static void main(String[] args){
        TiresSize S10 = new TiresSize("10");
        Tiers GoodTiers = new Tiers(S10);
        Icebreaker ermak = new Icebreaker("Icbraker Disel", 36000, 54, "Liquid", "Ermak", 20241);
        LawnMover powerSmart = new LawnMover("Honda for lawn movers", 4, 1, "Air", "HRR216VKA", 2);
        Scooter hondaRuckus = new Scooter("Honda 49cc", 7, 1, "Liquid", "Ruckus", "Honda", 2, GoodTiers);
        String test = hondaRuckus.getTiers().getTires().getTireSize();
        System.out.println(test);
    }
}
